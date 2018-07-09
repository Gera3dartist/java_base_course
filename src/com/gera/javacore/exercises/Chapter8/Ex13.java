package com.gera.javacore.exercises.Chapter8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 07.07.18
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 *
 * Соедините все элементы в потоках данных Stream<ArrayList<T>> и Array List<T>.
 * Покажите, как добиться этого с помощью каждой из трех форм метода reduce().
 */
public class Ex13 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> foo  = new ArrayList<>();
        ArrayList<Integer> r1 = new ArrayList<>();
        r1.add(1);
        r1.add(2);
        r1.add(4);
        r1.add(6);

        ArrayList<Integer> r2 = new ArrayList<>();
        r1.add(5);
        r1.add(8);
        r1.add(9);
        r1.add(10);

        ArrayList<Integer> r3 = new ArrayList<>();
        r1.add(11);
        r1.add(12);
        r1.add(13);
        r1.add(6);

        foo.add(r1);
        foo.add(r2);
        foo.add(r3);
//        foo.add(r3);


//        for (Integer value : reduce1(foo.stream())) {
//        for (Integer value : reduce2(Stream.empty())) {
        for (Integer value : reduce3(foo.stream())) {
            System.out.println(value);
        }

    }

    public static ArrayList<Integer> reduce1(Stream<ArrayList<Integer>> st1) {
        Optional<ArrayList<Integer>> res = st1.reduce((el1, el2) -> {el1.addAll(el2); return el1; });
        return res.get();
    }

    public static ArrayList<Integer> reduce2(Stream<ArrayList<Integer>> st1) {
        ArrayList<Integer> container = new ArrayList<>();
        ArrayList<Integer> res = st1.reduce(container, (el1, el2) -> {el1.addAll(el2); return el1; });
        return res;
    }

    public static ArrayList<Integer> reduce3(Stream<ArrayList<Integer>> st1) {
        ArrayList<Integer> container = new ArrayList<>();
        ArrayList<Integer> res = st1.parallel().reduce(
                container,
                (el1, el2) -> {el1.addAll(el2); return el1; },
                (coll1, coll2) -> {coll1.addAll(coll2); return coll1; });
        return res;
    }
}
