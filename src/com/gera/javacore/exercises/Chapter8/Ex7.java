package com.gera.javacore.exercises.Chapter8;
/*
* Преобразовав содержимое файла в поток лексем,
* выведите список первых 100 лексем, являющихся словами в том смысле,
 * в каком они определены в преды дущем упражнении.
 * Прочитайте содержимое файла снова и выведите список
 * из 10 наиболее часто употребляемых слов, игнорируя регистр букв.
 * */

import java.io.IOException;
import java.nio.file.Files;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Ex7 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException{
        Set<String> foo = showElements().limit(100).collect(Collectors.toSet());
        for (String item : foo) {
            System.out.println(item);}

        // joining
        String bar = showElements().distinct().collect(Collectors.joining(", "));
        System.out.println(">> BAR: " + bar);

        // count of distinct words:
        long cnt= showElements().distinct().count();
        System.out.println(">> count of distinct: " + cnt);

        // sumarizing
        IntSummaryStatistics sumStat = showElements()
                .distinct()
                .collect(Collectors.summarizingInt(String::length));
        System.out.println("--- Statistic ---");
        System.out.println("Average length: " + sumStat.getAverage());
        System.out.println("Max length: " + sumStat.getMax());



        // output 10 most frequent appeared words
        Map<String, Long> stat = (Map<String, Long>)Files.lines(Ex2.path).parallel()
                .flatMap(w -> Stream.of(w.split("\\s+"))
                        .filter(Ex6::isAlpha)
                        .map(String::toLowerCase))
                .collect(
                        Collectors.groupingBy(
                                Function.identity(), // provides a way to refer to self in next occurences
                                Collectors.counting()));
        Map<String, Long> result = stat.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(10)
                .collect(
                        Collectors.toMap(
                                Map.Entry::getKey,
                                Map.Entry::getValue, (a, b) -> {
                            throw new IllegalStateException();
                        },
                                LinkedHashMap::new)
                );
        System.out.println(result);



    }

    public static Stream<String> showElements() throws IOException{
        return Files.lines(Ex2.path).parallel()
                .flatMap(w -> Stream.of(w.split("\\s+")).filter(Ex6::isAlpha));

    }

}
