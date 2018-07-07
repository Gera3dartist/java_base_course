package com.gera.javacore.exercises.Chapter8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 01.07.18
 * Time: 2:14
 * To change this template use File | Settings | File Templates.
 *
 * Допустим, что ваш непосредственный начальник дал вам задание
 * написать метод public static <Т> boolean isFinite (Stream<T> stream).
 * Почему это не самая удачная мысль? Все равно напишите этот метод.
 */
public class Ex11 {
    public static void main(String[] args) {
        boolean finite = isFinite(Stream.generate(Math::random));
        System.out.println(">>>is finite: " + finite);
        int [] foo = {1, 2, 3};
        boolean finite1 = isFinite(Stream.of(foo));
        System.out.println(">>>is finite: " + finite1);
    }

    public static <T> boolean isFinite(Stream<T> stream) {
        Long res = stream.spliterator().getExactSizeIfKnown();
        System.out.println(">>RES: " + res);
        return res >= 0;
    }
}
