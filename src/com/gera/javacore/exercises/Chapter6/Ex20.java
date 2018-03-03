package com.gera.javacore.exercises.Chapter6;

/*
*
   0SafeVarargs public static final <T> T[] repeat(int n, T... objs)
Он должен возвращать массив n копий заданных объектов. Имейте в виду,
что для этого не потребуется объект типа C l a s s или ссылка на конструктор,
 по скольку наращивать количество объектов o b j s можно рефлексивно.
 */

import java.util.Arrays;

public class Ex20 {
    @SafeVarargs public static final <T> T[] repeat (int n, T... objs) {
        T[] res = (T[]) java.lang.reflect.Array.newInstance(objs[0].getClass(), n*objs.length);

        for (int j=0; j<objs.length; j++) {

            for (int i=j*n; i<((j+1)*n); i++) {
                res[i] = objs[j];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String [] res = Ex20.repeat(3, "foo", "bar", "faz");
        System.out.println(Arrays.toString(res));

    }
}
