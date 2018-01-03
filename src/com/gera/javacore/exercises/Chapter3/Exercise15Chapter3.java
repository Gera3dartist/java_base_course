package com.gera.javacore.exercises.Chapter3;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.01.18
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */
public class Exercise15Chapter3 {
    private static Random generator = new Random();

    private static class RandomSequence implements IntSequence{
        public int next() {return generator.nextInt();}
        public boolean hasNext() {return true;}
    }

    public IntSequence randomInts() {
        return new RandomSequence();
    }

}
