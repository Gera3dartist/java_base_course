package com.gera.javacore.exercises.Chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 19.02.18
 * Time: 23:06
 * To change this template use File | Settings | File Templates.
 */
public class Ex8<T extends Comparable> {
    private T item1;
    private T item2;

    public Ex8(T item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T min() {
        return item1.compareTo(item2) < 0 ? item1 : item2;
    }

    public T max() {
        return item1.compareTo(item2) > 0 ? item1 : item2;
    }

    public static void main(String[] args) {
        Ex8Type item1 = new Ex8Type(10);
        Ex8Type item2 = new Ex8Type(11);

        Ex8<Ex8Type> handler = new Ex8<Ex8Type>(item1, item2);
        System.out.println("max is: " + handler.max());
        System.out.println("min is: " + handler.min());
    }

}
