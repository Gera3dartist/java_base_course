package com.gera.javacore.exercises.Chapter6;

/*
* Реализуйте метод шар (), получающий списочный массив и объект типа FunctiorKT , R> (см. главу 3)
 * и возвращающий списочный массив, состоящий из результатов
 * применения функции к заданным элементам этого массива.*/

import java.util.ArrayList;
import java.util.function.Function;

public class Ex15 {
    public static <R, T> ArrayList<R> map(ArrayList<T> target, Function<T, R> func) {
        ArrayList<R> result = new ArrayList<>();
        for (T item : target) {
            result.add(func.apply(item));
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> target = new ArrayList<>();
        target.add("foo");
        target.add("baar");

        ArrayList<Integer> result = Ex15.map(target, (String item) ->item.length() );
        for (Integer item: result){
            System.out.println(item);
        }

    }
}
