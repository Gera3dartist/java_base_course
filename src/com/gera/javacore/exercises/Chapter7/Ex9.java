package com.gera.javacore.exercises.Chapter7;

/*
* Счетчик в отображении счетчиков можно обновить следующим образом:
counts.merge(word, 1, Integer::sum);
Сделайте то же самое без метода merge (), воспользовавшись,
во-первых, методом contains ();
во-вторых, методом get () и проверкой пустых значений (null);
в-третьих, методом getOrDefault () и,
в-четвертых, методом putlf Absent().
*
* */

import java.util.HashMap;


public class Ex9 {
    public static void main(String[] args) {
        String[] file = {
                "foo bar baz vika",
                "bam dam baz bika",
                "drum bar zaz vika",
        };
        HashMap<String, Integer> counts = new HashMap<>();
        for (String line : file) {
            for (String token : line.split(" ")) {
                // replace this: counts.merge(token, 1, Integer::sum);
//                case2(counts, token);
//                case3(counts, token);
                case4(counts, token);
            }
        }
        System.out.println(counts);
    }

    public static void case2(HashMap container, String token) {
        if (container.get(token) == null) {
            container.put(token, 1);
        } else {
            container.put(token, (Integer) container.get(token) + 1);
        }
    }

    public static void case3(HashMap container, String token) {
        container.getOrDefault(token, 1);
    }

    public static void case4(HashMap container, String token) {
        container.putIfAbsent(token, 1);
    }

}
