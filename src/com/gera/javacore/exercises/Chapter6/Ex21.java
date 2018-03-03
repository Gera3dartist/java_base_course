package com.gera.javacore.exercises.Chapter6;
/*
*
* Используя аннотацию 0 S a f e V a r a r g s , напишите метод, позволяющий строить массивы обобщенных типов, как в следующем примере:
* List<String>[] result = Arrays.<List<String»construct (10) ;
// Устанавливает результат в списке типа List<String>[] длиной 10
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex21 {

    @SuppressWarnings("unchecked")
    public static <T> T[] construct(int length){
        return null;
    }

    public static <T> T[] helper(Class<T> tp, int length) {
        return (T[]) Array.newInstance(tp, length);
    }

    public static void main(String[] args) {
        //looks like it can not be done
        List<String>[] result = Ex21.<List<String>>construct(10);
        List<String> element = new ArrayList<>();
        element.add("foo");
        element.add("bar");
        element.add("bazzz");
        result[0] = element;
        System.out.println(Arrays.toString(result));
    }
}
