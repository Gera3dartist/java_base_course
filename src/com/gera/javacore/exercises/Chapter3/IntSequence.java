package com.gera.javacore.exercises.Chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 15:18
 * To change this template use File | Settings | File Templates.
 */
public interface IntSequence {
    default int next(){return 0;}
    default boolean hasNext() {return true;}

    public static IntSequence of(int... values) {
        return new IntSequence() {
            private int counter;

            public int next() {
                try {
                    return values[counter];
                } finally {
                    counter++;
                }
            }
            public boolean hasNext() {
                return counter < values.length;
            }
        };
    }
}
