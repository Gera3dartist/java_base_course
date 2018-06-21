package com.gera.javacore.exercises.Chapter7;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 15:14
 * Используя метод Collections . shuffle (), напишите программу для чтения
 предложения, перетасовки его слов и вывода результата. Устраните (до и после
 перетасовки) написание начального слова с заглавной буквы и наличие точки в
 конце предложения. Подсказка: не перетасовывайте при этом слова.
 */
public class Ex12 {
    public static List<String> shuffle(String words) {
        String [] sent = words.split(" ");
        sent[0] = sent[0].toLowerCase();
        sent[sent.length-1] = sent[sent.length-1].replace(".", "");
        List<String> sentence = Arrays.asList(sent);
        Collections.shuffle(sentence);
        return sentence;
    }

    public static void main(String[] args) {
        String sent = "Foo you, du kennst mich, I've seen you last summer.";
        System.out.println(String.join(" ", shuffle(sent)));

    }
}
