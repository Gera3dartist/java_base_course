package com.gera.javacore.exercises.Chapter6;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 18.02.18
 * Time: 16:19
 Реализуйте обобщенный метод, присоединяющий все элементы из одного
 списочного массива к другому. Воспользуйтесь метасимволом подстановки для
 обозначения одного из аргументов типа. Предоставьте два равнозначных реше­
 ния: одно с подстановочным типом ? e x t e n d s Е, другое — с подстановочным
 типом ? s u p e r Е.
 */
public class Ex6<E> {
    public void join(ArrayList<E> list1,  ArrayList<? extends E> list2) {
        for (E item : list2) {list1.add(item);}
    }

    public void join2(ArrayList<? super E> list1,  ArrayList<E> list2) {
        for (E item : list2) {list1.add(item);}
    }

    public static void main(String[] args) {
        testJoin();
        testJoin2();
    }

    public static void testJoin(){
        Ex6<Exception> container = new Ex6<>();
        ArrayList<Exception> exlist = new ArrayList<>();
        ArrayList<RuntimeException> ex2list = new ArrayList<>();
        exlist.add(new Exception("init for ex"));
        ex2list.add(new RuntimeException("init for rex"));
        container.join(exlist, ex2list);
        System.out.println("join2: new size is : " + exlist.size());
    }

    public static void testJoin2(){
        Ex6<RuntimeException> container = new Ex6<>();
        ArrayList<Exception> exlist = new ArrayList<>();
        ArrayList<RuntimeException> ex2list = new ArrayList<>();
        exlist.add(new Exception("init for ex"));
        ex2list.add(new RuntimeException("init for rex"));
        container.join2(exlist, ex2list);
        System.out.println("join2: new size is : " + exlist.size());
    }


}
