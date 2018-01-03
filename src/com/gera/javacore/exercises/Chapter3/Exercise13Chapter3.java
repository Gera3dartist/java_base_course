package com.gera.javacore.exercises.Chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.01.18
 * Time: 16:51
 * To change this template use File | Settings | File Templates.
 */
public class Exercise13Chapter3 {
    public static void main(String[] args) {
        Runnable [] actions = {
                ()-> System.out.println("foo bar 1"),
                ()-> System.out.println("foo bar 2"),
                ()-> System.out.println("foo bar 3"),
        };
        wrapper(actions).run();
    }

    public static Runnable wrapper(Runnable [] actions) {
        return () -> {
            for (Runnable action : actions) {
                action.run();
            }
        };
    }
}
