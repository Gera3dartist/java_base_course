package com.gera.javacore.exercises.Chapter6;
/*
*
* Рассмотрите следующий метод, представленный в разделе 6.6.3:
public static <Т> Т[] repeat(int n, Т obj, IntFunction<T[]> constr)

Почему исход вызова Arrays.repeat (10, 42, int[] ::new) окажется неудач ным?
Как устранить этот недостаток?
Что нужно сделать для применения дру гих примитивных типов?
*
* */

import java.util.Arrays;
import java.util.function.IntFunction;

public class Ex18 {
    public static <T> T[] repeat(int n, T obj, IntFunction<T[]> constr) {
        T[] result = constr.apply(n);
        for (int i=0; i<n; i++) {
            result[i] = obj;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] result = Ex18.repeat(5, "FOO", String[]::new);
        System.out.println(Arrays.toString(result));
    }
}
