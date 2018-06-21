package com.gera.javacore.exercises.Chapter8;

import java.util.stream.Stream;

/**
 * Убедитесь, что запрос первых пяти длинных слов не требует вызова метода

 f i l t e r (), если найдено пятое длинное слово. С этой целью просто организуй-
 те протоколирование вызова каждого метода.
 */


public class Ex1 {
    public static void main(String[] args) {
        long count = Stream.of("foo", "bar", "bammm").filter(w -> w.length() > 3).count();
        System.out.println(count);
    }
}
