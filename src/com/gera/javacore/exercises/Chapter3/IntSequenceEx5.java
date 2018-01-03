package com.gera.javacore.exercises.Chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 15:54
 * To change this template use File | Settings | File Templates.
 */
public class IntSequenceEx5 {
    private interface ConstantSequence {
        int constant(int n);
    }

    private static class ConstSeqClass implements ConstantSequence {
        public int constant(int n) {
            return n;
        }
    }

    public static void main(String[] args) {
        ConstantSequence func = (int n)-> n;
        for(int i=0; i<10; i++) {
            System.out.println("Constant is: " + func.constant(10));
        }

        ConstSeqClass item = new ConstSeqClass();
        for(int i=0; i<10; i++) {
            System.out.println("Versuch2: Constant is: " + item.constant(10));
        }

    }

}
