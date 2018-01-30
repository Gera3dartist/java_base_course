package com.gera.javacore.exercises.Chapter5;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 31.01.18
 * Time: 0:08
 * To change this template use File | Settings | File Templates.
 */
public class Ex11 {
    public static void main(String[] args) {
        String path = null;
        try {
            assert path != null : "Test1: path should be notnull";
        } catch (AssertionError ex) {
            ex.printStackTrace();
        }
        Objects.requireNonNull(path, "Test2: path should be not null");

    }
}
