package com.gera.javacore.exercises.Chapter8;
/*
* Найдите 500 самых длинных слов в романе "Война и мир",
* используя парал лельный поток данных.
* Насколько это делается быстрее, чем при использова нии последовательного потока данных?
*/

import com.gera.javacore.PathConfig;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Comparator;
import java.util.stream.Stream;

public class Ex16 {

    public static void main(String[] args) throws IOException{
        Files.lines(PathConfig.mac_voina_i_mir)
                .parallel()
                .flatMap(word -> Stream.of(word.split("\\s")))
                .distinct()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(500)
                .forEach(System.out::println);
    }
}
