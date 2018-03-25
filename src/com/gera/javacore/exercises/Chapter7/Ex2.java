package com.gera.javacore.exercises.Chapter7;

import javax.xml.stream.StreamFilter;
import java.util.Arrays;
import java.util.Iterator;

public class Ex2 {
    public static void main(String[] args) {
        String [] example = {"foo", "bar", "baz"};
        byIndex(example);
        byIterator(example);
        byReplaceAll(example);
    }

    public static void byIndex(String [] iter) {
        for (int i=0; i<iter.length; i++) {
            iter[i] = iter[i].toUpperCase();
        }
    }

    public static void byIterator(String [] iter) {
        Iterator<String> iterator = Arrays.stream(iter).iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toUpperCase());

        }
    }

    public static void byReplaceAll(String [] iter) {
        for (String word : iter) {
            System.out.println(word.replaceAll("([A-Z])", "$1").toUpperCase());
        }
    }

}
