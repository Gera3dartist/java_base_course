package com.gera.javacore.exercises.Chapter7;

/*
*
* Реализуйте алгоритм под названием "Решето Эратосфена"
* для выявления всех простых чисел меньше или равных п.
* Сначала введите все числа от 2 до п в мно жество.
* Затем организуйте повторяющийся поиск наименьшего элемента s в этом множестве,
* постепенно удаляя из него элементы s 2, s • ( s + 1), s • ( s + 2) и т.д.
* Этот поиск завершается при условии, когда s 2 > п.
* Реализуйте данный алгоритм как для множества типа HashSet<Integer>,
* так и для множества типа BitSet.
* */

import java.util.BitSet;
import java.util.HashSet;

import static java.lang.Math.sqrt;

public class Ex1 {

    public static void main(String[] args) {
        System.out.println(algHashSet(100));
        System.out.println(algBitSet(100));
        System.out.println(algHashSetnew(100));

    }

    public static HashSet algHashSet(int n) {
        /*
        * Initial raw solution
        */
        HashSet<Integer> cont = new HashSet<>();
        for (int i=2; i<n; i++) {
            cont.add(i);
        }

        int item = 2;
        while(item < n) {
            for (int i=2; i<n; i++){
                int newItem = item*i;
                if (cont.contains(newItem)){
                    cont.remove(newItem);
                }
                if (newItem >= n) {
                    break;
                }
            }
            item++;
        }
        return cont;
    }

    public static BitSet algBitSet(int n) {
        /*
        * Reference: https://www.developer.com/java/data/exploring-java-bitset.html
        **/
        BitSet cont = new BitSet();
        int newMax = (n-2)/2;

        int remove = 0;
        for (int i = 1; i < newMax; i++){
            for (int j = i; i + j + 2 * i * j < n; j++) {
                cont.set(i + j + 2 * i * j);
            }
        }
        BitSet ret = new BitSet();
        ret.set(2);
        for (int i=1; i < newMax; i++) {
            if (cont.get(i) == false) {ret.set(2*i+1);}
        }
        return ret;

    }


    public static HashSet algHashSetnew(int n) {
        /*
         * Initial raw solution
         */
        HashSet<Integer> cont = new HashSet<>();
        for (int i=2; i<n; i++) {
            cont.add(i);
        }

        for (int i=2; i<sqrt(n); i++) {
            for (int j = 0; i * i + j * i < n; j++) {
                cont.remove(i * i + j * i);
            }
        }
        return cont;
    }

}

