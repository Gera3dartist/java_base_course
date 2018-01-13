package com.gera.javacore.exercises.Chapter4;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 13.01.18
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionIntArrayEx10Chapter4 {
    public static void main(String[] args) {
        Class<?> cl = int[].class;
        while (cl != null) {
            System.out.println("Type: " + cl.getTypeName());
            for (Method m: cl.getDeclaredMethods()) {
                System.out.println(
                        Modifier.toString(m.getModifiers()) + " " +
                        m.getReturnType().getCanonicalName() + " " +
                        m.getName() + " " +
                        Arrays.toString(m.getParameters())
                );
            }
            cl = cl.getSuperclass();
        }
    }

}
