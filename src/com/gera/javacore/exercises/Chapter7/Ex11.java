package com.gera.javacore.exercises.Chapter7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 13:15
 * Technical description:
 * Напишите программу для чтения предложения в списочный массив. Затем пе­
 ретасуйте в массиве все слова, кроме первого и последнего, используя метод
 Collections. shuffle (), но не копируя слова в другую коллекцию.
 */
public class Ex11 {
    public static List<String> shuffle(String words) {
        List<String> sentence = Arrays.asList(words.split(" "));
        Collections.shuffle(sentence.subList(1, sentence.size()-2));
        return sentence;
    }

    public static void main(String[] args) {
        String sent = "hey you, du kennst mich, I've seen you last summer";
        System.out.println(String.join(" ", shuffle(sent)));

    }
}
