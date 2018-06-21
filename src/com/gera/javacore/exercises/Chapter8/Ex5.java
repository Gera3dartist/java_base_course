package com.gera.javacore.exercises.Chapter8;
/*
* Метод l e t t e r s (), упоминавшийся в разделе 8.3, выглядит несколько неуклю же,
* поскольку в нем сначала получается списочный массив, а затем он пре вращается в поток данных.
 * Напишите другой, однострочный вариант этого метода, используя поток данных.
 * Преобразуйте значения типа i n t в пределах от 0 до s .length () - 1 с помощью подходящего лямбда-выражения*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex5 {

    public static void main(String[] args) {
        Stream<String> res = letters2("abcdefg");
        res.forEach(System.out::println);

    }
    public static Stream<String> letters2(String s) {
        return IntStream.range(0, s.length()).mapToObj(i -> s.substring(i, i+1));

    }

    public static Stream<String> letters(String s) {
        List<String> result = new ArrayList();
        for (int i = 0; i < s.length(); i++)
            result.add(s.substring(i, i + 1));
            return result.stream();
    }

}
