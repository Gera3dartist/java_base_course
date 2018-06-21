package com.gera.javacore.exercises.Chapter8;
/*
*
* Воспользуйтесь методом String.codePoints () для реализации метода,
* проверяющего, является ли символьная строка словом, состоящим только из букв.
* (Подсказка: воспользуйтесь методом Character.isAlphabetic ().)
* Реализуйте тем же самым способом метод, проверяющий, является
* ли символьная строка достоверным в Java идентификатором.*/

import java.util.stream.IntStream;

public class Ex6 {

    public static void main(String[] args) {
        System.out.println(isAlpha("123abc"));
        System.out.println(isAlpha("abd"));
        System.out.println(isAlpha("___"));
        System.out.println(isAlpha("1234"));
    }


    static boolean isAlpha(String word) {
        return IntStream.range(0, word.length())
                .mapToObj(i -> Character.isAlphabetic(word.codePointAt(i)))
                .allMatch(v -> v);

    }

}
