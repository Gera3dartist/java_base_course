package com.gera.javacore.exercises.Chapter8;

import java.io.IOException;
import java.nio.file.Files;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 01.07.18
 * Time: 0:41
 * To change this template use File | Settings | File Templates.
 * Прочитайте слова из файла /usr/share/dict/words (или аналогичного списка слов)
 * в поток данных и получите массив всех слов,
 * содержащих пять отдельных гласных.
 */
public class Ex8 {
    private static String [] vowels = {"a","e","i","o","u"};
    public static void main(String[] args) throws IOException {

        Files.lines(Ex2.words)
                .parallel()
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }

    public static boolean checkWord(String word) {

        for (String c : vowels) {
            if (!word.contains(c)) {return false;}
        }
        return true;
    }
}
