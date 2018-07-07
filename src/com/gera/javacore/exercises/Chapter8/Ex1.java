package com.gera.javacore.exercises.Chapter8;

import java.util.stream.Stream;


/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 01.06.18
 * Time: 8:16
 * Убедитесь, что запрос первых пяти длинных слов не требует вызова метода filter (),
 * если найдено пятое длинное слово. С этой целью просто организуйте протоколирование вызова каждого метода.
 */
public class Ex1 {
    public static void main(String[] args) {
        smartFilter(3, "foo", "fooo", "biig", "weeeeek");

    }

    public static void smartFilter(int size, String... valuse){
//        IntStream.range(0, valuse.length -1 ).filter(i -> i % 5 == 0 && valuse[i].length() >= size)
//                .filter()
        Stream.of(valuse).filter(s -> s.length() > size).forEach(System.out::println);

    }

    public static void main2(String[] args) {
        long count = Stream.of("foo", "bar", "bammm").filter(w -> w.length() > 3).count();
        System.out.println(count);
    }
}