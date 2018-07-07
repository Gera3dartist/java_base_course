package com.gera.javacore.exercises.Chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 01.07.18
 * Time: 1:35
 * To change this template use File | Settings | File Templates.
 */
public class Ex9 {
    public static void main(String[] args) throws IOException {
        IntSummaryStatistics sumStat = Files.lines(Ex2.words)
                .parallel()
                .map(String::toLowerCase).collect(Collectors.summarizingInt(String::length));
        System.out.println("--- Statistic ---");
        System.out.println("Average length: " + sumStat.getAverage());
        System.out.println("Max length: " + sumStat.getMax());
    }
}
