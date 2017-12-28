package com.gera.javacore.exercises.Chapter2;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import java.util.Random;

/**
 * Exercise 10 Chapter2
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 28.12.17
 * Time: 12:56
 * To change this template use File | Settings | File Templates.
 */
public class RandomNumbers {
    private static ThreadLocalRandom generator = ThreadLocalRandom.current();

    public static void main(String[] args) {
        ArrayList<Integer> cont1 = new ArrayList<>();
        cont1.add(1);
        cont1.add(4);
        cont1.add(12);
        cont1.add(100);
        cont1.add(17);
        int [] cont2 = new int [] {2, 34, 5, 6};
        System.out.println("radnom value from array: " + randomElement(cont2));
        System.out.println("radnom value from arraylist: " + randomElement(cont1));
    }

    public static int randomElement(int [] container){
        return container[generator.nextInt(0, container.length)];
    }

    public static Integer randomElement(ArrayList<Integer> container){
        return container.get(generator.nextInt(0, container.size()));
    }
}
