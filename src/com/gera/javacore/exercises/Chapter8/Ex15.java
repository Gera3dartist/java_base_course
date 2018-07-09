package com.gera.javacore.exercises.Chapter8;
/*
 * Найдите 500 простых чисел с 50 десятичными цифрами,
 * используя параллель ный поток данных типа Biglnteger и метод Biglnter.isProbablePrime ().
 * Насколько это делается быстрее, чем при использовании последовательного потока данных?
 */


import java.math.BigInteger;
import java.util.stream.Stream;

public class Ex15 {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        Stream
                .iterate(BigInteger.ZERO, n -> n.add(BigInteger.ONE))
                .parallel()
                .filter(n -> n.isProbablePrime(1) && n.toString().length() >= 10).limit(500)
                .forEach(System.out::println);
        System.out.println("took: " + (System.currentTimeMillis() - t1)/1000F);
    }
}
