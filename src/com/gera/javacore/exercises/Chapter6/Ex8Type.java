package com.gera.javacore.exercises.Chapter6;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 19.02.18
 * Time: 23:01
 * To change this template use File | Settings | File Templates.
 */
public class Ex8Type implements Comparable {
    private int size;

    public Ex8Type(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public int compareTo(Object o) {
        return this.getSize() - ((Ex8Type) o).getSize();
    }

    @Override
    public String toString() {
        return "Ex8Type{" +
                "size=" + size +
                '}';
    }
}
