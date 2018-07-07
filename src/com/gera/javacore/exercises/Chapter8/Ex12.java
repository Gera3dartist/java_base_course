package com.gera.javacore.exercises.Chapter8;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.07.18
 * Time: 23:09
 *
 * Напишите метод public static <Т> Stream<T> zip (Stream<T> first, Stream<T> second),
 * изменяющий элементы из потоков данных first и second
 * (или возвращающий пустое значение null,
 * если в потоке данных, черед которого настает,
 * исчерпываются элементы).
 * Reference: https://stackoverflow.com/questions/24059837/iterate-two-java-8-streams-together/24063511?noredirect=1#comment39119022_24063511
 */
public class Ex12 {
    public static void main(String[] args) {
        Stream<String> it1 = Arrays.asList("foo","bar","baz","boo").stream();
        Stream<String> it2= Arrays.asList("foo","bar","baz","boo").stream();
        Stream<String> st = Ex12.<String>zip(it1, it2);
        st.forEach(System.out::println);

    }
    public static < T > Stream<T> zip (Stream<T> first, Stream<T> second) {
        Iterator<T> it1 = first.iterator();
        Iterator<T> it2 = second.iterator();
        Iterable<Pair<T, T>> it = () -> new Iterator<Pair<T, T>>() {
            public boolean hasNext(){return it1.hasNext() && it2.hasNext();}
            public Pair<T, T> next() {return new Pair<T, T>(it1.next(), it2.next());}
        };
        return StreamSupport.stream(it.spliterator(), false).map(pair -> pair.getKey());


    }
}
