package com.gera.javacore.exercises.Chapter7;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 14.03.18
 * Time: 1:51
 * To change this template use File | Settings | File Templates.
 */
public class Ex1 {
    public static void main(String[] args) {
        HashSet<Integer> iterable = new HashSet<>();

    }

    public static void solution(int n) {
        HashSet<Integer> iterable = new HashSet<>();
        for (int i=2; i<=n; i++) {
            iterable.add(i);
        }


    }
}
