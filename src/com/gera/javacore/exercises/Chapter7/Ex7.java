package com.gera.javacore.exercises.Chapter7;

/*
* Напишите программу для чтения всех слов из файла и вывода частоты, с ко торой каждое слово встречается в нем. Воспользуйтесь для этой цели классом TreeMap<String, IntegerX*/

import java.util.TreeMap;

public class Ex7 {
    public static void main(String[] args) {
        String [] file = {
                "foo bar baz vika",
                "bam dam baz bika",
                "drum bar zaz vika",
        };
        TreeMap<String, Integer> counts = new TreeMap<>();
        for (String line : file) {
            for (String token: line.split(" ")) {
                counts.merge(token, 1, Integer::sum);
            }
        }
        System.out.println(counts);
    }
}
