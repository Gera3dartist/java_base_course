package com.gera.javacore.exercises.Chapter4;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 13.01.18
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class ExploreClassEx8Chapter4 {
    public static void main(String[] args) {
        Class<?> cl1 = String[].class;
        Class<?> cl2= int.class;
        Class<?> cl3= ExploreClassEx8Chapter4.Internal.class;

        System.out.println("--------------cl1----------------");
        System.out.println(cl1.getName());
        System.out.println(cl1.getTypeName());
        System.out.println(cl1.toGenericString());
        System.out.println(cl1.getCanonicalName());
        System.out.println("--------------cl2----------------");
        System.out.println(cl2.getName());
        System.out.println(cl2.getTypeName());
        System.out.println(cl2.toGenericString());
        System.out.println(cl2.getCanonicalName());
        System.out.println("--------------cl3----------------");
        System.out.println(cl3.getName());
        System.out.println(cl3.getTypeName());
        System.out.println(cl3.toGenericString());
        System.out.println(cl3.getCanonicalName());
        /**
         * Output:
         * --------------cl1----------------
         [Ljava.lang.String;
         java.lang.String[]
         public abstract final class [Ljava.lang.String;
         java.lang.String[]
         --------------cl2----------------
         int
         int
         int
         int
         --------------cl3----------------
         com.gera.javacore.exercises.Chapter4.ExploreClassEx8Chapter4$Internal
         com.gera.javacore.exercises.Chapter4.ExploreClassEx8Chapter4$Internal
         private static class com.gera.javacore.exercises.Chapter4.ExploreClassEx8Chapter4$Internal
         com.gera.javacore.exercises.Chapter4.ExploreClassEx8Chapter4.Internal
         * */


    }
    private static class Internal {}

}
