package com.gera.javacore.exercises.Chapter8;

import java.util.stream.LongStream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 04.06.18
 * Time: 8:41
 * To change this template use File | Settings | File Templates.
 */
public class Ex4 {
    public static void main(String[] args) {
        generator(25214903917L, 11, (long) Math.pow(2, 48)).limit(100).forEach(System.out::println);

    }

    static LongStream generator(long a, long c, long m) {
        return LongStream.iterate(0, n -> (a * n + c) % m);
    }
}
