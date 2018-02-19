package com.gera.javacore.exercises.Chapter6;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 19.02.18
 * Time: 23:39
 * To change this template use File | Settings | File Templates.
 */
public class Ex_10_11_12 {
    @SuppressWarnings("unchecked")
    public static <T extends Comparable> T min(T[] items) {
        if (items.length==0){return null;}
        T min = items[0];
        for (int i=1; i<items.length; i++){
            if (min.compareTo(items[i]) > 0) {min = items[i];}
        }
        return min;
    }

    @SuppressWarnings("unchecked")
    public static <T extends Comparable> T max(T[] items) {
        if (items.length==0){return null;}
        T max = items[0];
        for (int i=1; i<items.length; i++){
            if (max.compareTo(items[i]) < 0) {max = items[i];}
        }
        return max;
    }

    public static <T> Ex7<T> minMax(T[] items) {
        if (items.length==0){return null;}
        Arrays.sort(items);
        return new Ex7<T>(items[0], items[items.length-1]);
    }

    public static <T> void minmax(List<T> elements, Comparator<? super T> comp, List<? super T> result) {
        Collections.sort(elements, comp);
        result.add(elements.get(0));
        result.add(elements.get(elements.size()-1));
    }

    public static void testMin() {
        String[] items = {"foo", "foooo"};
        System.out.println("Min is: " + Ex_10_11_12.<String>min(items));
    }

    public static void testMax() {
        String[] items = {"foo", "foooo"};
        System.out.println("Max is: " + Ex_10_11_12.<String>max(items));
    }

    public static void testMinMax() {
        String[] items = {"foo", "foooo", "very_long_word"};
        System.out.println("Min Max are: " + Ex_10_11_12.<String>minMax(items));
    }

    public static void testminmax() {
        List<Ex8Type> items = Arrays.asList(new Ex8Type(9), new Ex8Type(5), new Ex8Type(2));
        List<Comparable> result = new ArrayList<>();
        minmax(items, (item1, item2) -> item1.compareTo(item2), result);
        System.out.println("result for minmax: " + result);

    }

    public static void main(String[] args) {
        testMin();
        testMax();
        testMinMax();
        testminmax();

    }
}
