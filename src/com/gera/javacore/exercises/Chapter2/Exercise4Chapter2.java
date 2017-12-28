package com.gera.javacore.exercises.Chapter2;

import org.omg.CORBA.IntHolder;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 27.12.17
 * Time: 15:35
 * To change this template use File | Settings | File Templates.
 */
public class Exercise4Chapter2 {
    public static void main(String[] args) {
//        twistVariables();
//        testIntHolder();
        twistTwoIntegers();

    }

    /**
     * Demonstrates how to replace two variables without using temporary one
     * */
    public static void twistVariables() {
        int a = 1;
        int b = 2;
        System.out.println("value for a: " + a);
        System.out.println("value for b: " + b);
        a = a + b;
        b = -1*(b - a); // b - a - b = a
        a = a - b; // a + b - a = b
        System.out.println("after manipulation");
        System.out.println("value for a: " + a);
        System.out.println("value for b: " + b);
    }

    public static void testIntHolder() {
        IntHolder a = new IntHolder(1);
        IntHolder b = new IntHolder(2);
        System.out.println("value for a: " + a.value);
        System.out.println("value for b: " + b.value);
        a.value = a.value + b.value;
        b.value = -1*(b.value - a.value);
        a.value = a.value - b.value;
        System.out.println("after manipulation");
        System.out.println("value for a: " + a.value);
        System.out.println("value for b: " + b.value);
    }

    public static void twistTwoIntegers() {
        Integer a = 1;
        Integer b = 2;
        System.out.println("value for a: " + a);
        System.out.println("value for b: " + b);
        a = a + b;
        b = -1*(b - a); // b - a - b = a
        a = a - b; // a + b - a = b
        System.out.println("after manipulation");
        System.out.println("value for a: " + a);
        System.out.println("value for b: " + b);
    }

}
