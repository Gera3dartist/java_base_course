package com.gera.javacore.exercises.Chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
public class IntSequenceEx4 implements IntSequence {
    public static void main(String[] args) {
        IntSequence seq = IntSequence.of(1,3,4,5,6);
        while (seq.hasNext()) {
            System.out.println("el of sequence: " + seq.next());
        }
    }
}
