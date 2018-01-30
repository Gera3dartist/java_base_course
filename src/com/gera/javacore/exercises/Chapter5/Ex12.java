package com.gera.javacore.exercises.Chapter5;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 31.01.18
 * Time: 0:13
 * To change this template use File | Settings | File Templates.
 */
public class Ex12 {
    public static void main(String[] args) {
        int[] valuse = {5, 2, 0, 10, -1};
        System.out.println("min is: " + min(valuse));
    }

    public static int min(int[] values) {
        assert values.length > 0;
        int minValue = values[0];

        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        final int valmin = minValue;
        assert Arrays.stream(values).allMatch(value -> value < valmin): "Is min value";
        return minValue;

    }
}
