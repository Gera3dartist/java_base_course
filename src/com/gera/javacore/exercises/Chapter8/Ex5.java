package com.gera.javacore.exercises.Chapter8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 04.06.18
 * Time: 8:59
 * Метод letters (), упоминавшийся в разделе 8.3, выглядит несколько неуклюже,
 * поскольку в нем сначала получается списочный массив, а затем он превращается
 * в поток данных. Напишите другой, однострочный вариант этого метода, используя поток данных.
 * Преобразуйте значения типа int в пределах от 0 до s. length () - 1
 * с помощью подходящего лямбда-выражения
 */
public class Ex5 {
    public static void main(String[] args) {
        letters("foooooooobarr").forEach(System.out::println);
    }
    // TODO: leaving this just for history
//    public static Stream<String> letters (String s) {
//        int end = s.length()-1;
//        Stream<String> stream = Stream.iterate(s.substring(0, end), c -> s.substring());
//        Stream.of(s).forEach(System.out::println);
//        return stream;
//    }


    public static Stream<String> letters(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> s.substring(i, i+1));

    }

    public static Stream<String> letters2(String s) {
        List<String> result = new ArrayList();
        for (int i = 0; i < s.length(); i++)
            result.add(s.substring(i, i + 1));
        return result.stream();
    }
}
