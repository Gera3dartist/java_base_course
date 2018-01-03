package com.gera.javacore.exercises.Chapter3;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 19:27
 * To change this template use File | Settings | File Templates.
 */
public class ShuffleSortEx7 {
    public static void luckySort (ArrayList<String> strings, Comparator<String> comp){
        Collections.sort((List)strings, comp);

        while(comp.compare(strings.get(0), strings.get(strings.size()-1)) < 0) {
            System.out.println("Shuffling a list: " + Arrays.toString(strings.toArray()));
            Collections.shuffle((List) strings);
            System.out.println("After shuffling: " + Arrays.toString(strings.toArray()));
        }

    }
    public static void main(String[] args) {
        //do sorting here
        ArrayList<String> vikaAmplua = new ArrayList<>();
        vikaAmplua.add("Cat");
        vikaAmplua.add("Hovrah");
        vikaAmplua.add("Pinguin");
        vikaAmplua.add("Snake");
        vikaAmplua.add("Homniak");
        ShuffleSortEx7.luckySort(vikaAmplua, (s1, s2) -> (s1.compareTo(s2)));
    }
}
