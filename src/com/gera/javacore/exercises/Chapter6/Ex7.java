package com.gera.javacore.exercises.Chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 19.02.18
 * Time: 22:46
 * To change this template use File | Settings | File Templates.
 */
public class Ex7<E> {
    private E item1;
    private E item2;

    public Ex7(E item1, E item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public E getItem1() {
        return item1;
    }

    public E getItem2() {
        return item2;
    }

    @Override
    public String toString() {
        return "Ex7{" +
                "item1=" + item1 +
                ", item2=" + item2 +
                '}';
    }

    public static void main(String[] args) {
        Ex7<String> entry = new Ex7<String>("item1", "item2");

        System.out.println(entry.getItem1());
        System.out.println(entry.getItem2());
    }
}
