package com.gera.javacore.exercises.Chapter8;

import java.util.stream.IntStream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 04.06.18
 * Time: 8:34
 * Допустим, что имеется массив int [] values = { 1, 4, 9, 16 }.
 * Каков результат вызова Stream.of (values) ?
 * Как вместо этого получить поток данных типа int?
 */
public class Ex3 {
    public static void main(String[] args) {
        IntStream.iterate(0, n -> n + 1).limit(100).forEach(System.out::println);
    }
}
