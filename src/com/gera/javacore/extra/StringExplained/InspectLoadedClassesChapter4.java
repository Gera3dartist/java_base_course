package com.gera.javacore.extra.StringExplained;


import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 13.01.18
 * Time: 18:41
 * To change this template use File | Settings | File Templates.
 */
public class InspectLoadedClassesChapter4 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<?> cl = Class.forName("java.util.ArrayList");
        while(cl != null) {
            System.out.println("--------CLASS: " + cl.getCanonicalName() + "---------");
            for (Method m: cl.getDeclaredMethods()) {
                System.out.println("-------- traversing method: " + m.getName() + "-------");
                System.out.println(Modifier.toString(m.getModifiers()) + " "
                        + m.getReturnType().getCanonicalName() + " " +
                        m.getName() + "(" + Arrays.toString(m.getParameters()) + ")");

            }
            cl = cl.getSuperclass();
        }
    }
}
