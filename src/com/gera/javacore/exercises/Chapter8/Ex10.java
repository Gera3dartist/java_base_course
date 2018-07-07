package com.gera.javacore.exercises.Chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 01.07.18
 * Time: 2:11
 * To change this template use File | Settings | File Templates.
 * Определите все символьные строки максимальной длины в заданном конечном потоке символьных строк
 */
public class Ex10 {
    public static void main(String[] args) throws IOException {
        IntSummaryStatistics sumStat = Files.lines(Ex2.words)
                .parallel()
                .collect(Collectors.summarizingInt(String::length));
        Files.lines(Ex2.words)
                .parallel()
                .filter(w -> w.length() == sumStat.getMax())
                .forEach(System.out::println);

    }
}
