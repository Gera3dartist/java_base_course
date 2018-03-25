package com.gera.javacore.exercises.Chapter7;


import java.util.*;

/*
* Реализуйте метод public static void swap(List<?> list, int i, int j),
* вы полняющий перестановку элементов обычным образом, когда класс,
* определяющий тип параметра list, реализует интерфейс RandomAccess,
* а иначе сводящий к минимуму обход элементов на позициях, обозначаемых индексами i и j.
* */
public class Ex5 {
    public static void main(String[] args) {
        ArrayList<Integer> cont = new ArrayList<>();
        cont.add(1);
        cont.add(4);

        LinkedList<Integer> cont2 = new LinkedList<>();
        cont2.add(3);
        cont2.add(10);

        swap(cont, 0, 1);
        swap(cont2, 0, 1);
    }

    public static <E> void swap(List<E> list, int i, int j) {
        if (list instanceof RandomAccess) {
            System.out.println("with random access");
            E obj  = list.get(i);
            list.set(i, list.get(j));
            list.set(j, obj);
        } else {
            System.out.println("without random access");
            Collections.swap(list, i, j);
        }


    }
}
