package com.gera.javacore.exercises.Chapter7;
/*
*Как вычислить объединение, пересечение и разность двух множеств, используя только методы из интерфейса Set, но не организуя циклы?
*
*
* */

import java.util.HashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        Set<String> cont1 = new HashSet<>();
        Set<String> cont2 = new HashSet<>();
        Set<String> cont3 = new HashSet<>();
        Set<String> cont4 = new HashSet<>();
        cont1.add("foo");
        cont1.add("bar");
        cont1.add("baz");

        cont2.add("foo");
        cont2.add("bamz");
        cont2.add("vika");

        cont3.add("foo");
        cont3.add("bamz");
        cont3.add("vika");

        cont4.add("foo");
        cont4.add("bamz");
        cont4.add("vika");

        cont2.removeAll(cont1); // difference
        cont3.addAll(cont1); // merge
        cont4.retainAll(cont1); // intersection
        System.out.println("differece: " + cont2);
        System.out.println("merge: " + cont3);
        System.out.println("intersection: " + cont4);

    }
}
