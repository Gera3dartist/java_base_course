package com.gera.javacore.extra.StringExplained.java7.oldclass;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 16:38
 * To change this template use File | Settings | File Templates.
 */
public class DigitSequence implements Iterator<Integer> {
    private int [] collection;
    private int index = 0;

    public DigitSequence(int... numbers) {
        collection = numbers;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length;
    }

    @Override
    public Integer next() {
        int value = collection[index];
        index++;
        return value;
    }

    @Override
    public void remove() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public static void main(String[] args) {
        DigitSequence ds = new DigitSequence(1,3,5,6,7,8,20);
        while(ds.hasNext()){
            System.out.println("Element of the sequence: " + ds.next());
        }
    }
}
