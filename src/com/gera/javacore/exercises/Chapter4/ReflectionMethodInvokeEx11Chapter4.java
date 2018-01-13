package com.gera.javacore.exercises.Chapter4;

import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 13.01.18
 * Time: 20:41
 * To change this template use File | Settings | File Templates.
 */
public class ReflectionMethodInvokeEx11Chapter4 {
    public static void main(String[] args)
      throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            NoSuchFieldException,
            InstantiationException,
            InvocationTargetException {

        long startTime = System.nanoTime();
        printReflection();
        long endTime = System.nanoTime();
        long duration = startTime - endTime;
        System.out.println("Reflection Time: " + duration);
        long startTime1 = System.nanoTime();
        System.out.println("Hello world");
        long endTime1 = System.nanoTime();
        long duration1 = startTime1 - endTime1;
        System.out.println("Without Reflection time: " + duration1);
        System.out.println("Reflection takes longer, coef: " + (duration/duration1));

    }

    public static void printReflection()
            throws ClassNotFoundException,
            NoSuchMethodException,
            IllegalAccessException,
            NoSuchFieldException,
            InstantiationException,
            InvocationTargetException {

        Class<?> cl = Class.forName("java.lang.System");
        Field field = cl.getDeclaredField("out"); // Get field from System class

        Object printer = field.get(null); // out is static, pass null to get a value(instance)
        Method m = printer.getClass().getDeclaredMethod("println", String.class);
        m.invoke(printer, "Hello world");
    }


}
