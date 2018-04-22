package com.gera.javacore.exercises.Chapter7;

import java.util.HashSet;
import java.util.TreeMap;

public class Ex8 {
    public static void main(String[] args) {
        String [] file = {
                "foo bar baz vika",
                "bam dam baz bika",
                "drum bar zaz vika",
        };
        TreeMap<String, HashSet<Integer>> counts = new TreeMap<>();
        for (int i=0; i<file.length; i++) {

            for (String token: file[i].split(" ")) {
                if (!counts.containsKey(token)) {
                    HashSet<Integer> occur = new HashSet<>();
                    counts.put(token, occur);
                }
                counts.get(token).add(i);
            }
        }
        System.out.println(counts);
    }
}
