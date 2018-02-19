package com.gera.javacore.exercises.Chapter6;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 19.02.18
 * Time: 23:19
 Предоставьте в служебном классе A r r a y s следующий метод, возвращающий
 пару, состоящую из первого и последнего элементов массива а, указав подхо­
 дящий аргумент типа:
 public static <Е> Pair<E> firstLast(ArrayList<__ > a)
 */
public class Ex9<E> extends ArrayList {
    public static <E> Ex7<E> firstLast(ArrayList<E> a) {
        if (a.size()>=2) {
            return new Ex7<E>(a.get(0), a.get(a.size()-1));
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> foo = new ArrayList<>();
        foo.add("first");
        foo.add("middle");
        foo.add("last");
        System.out.println(Ex9.firstLast(foo));
    }
}
