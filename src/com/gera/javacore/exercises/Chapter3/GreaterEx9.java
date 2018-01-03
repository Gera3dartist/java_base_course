package com.gera.javacore.exercises.Chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 20:01
 * To change this template use File | Settings | File Templates.
 */
public class GreaterEx9 implements Runnable {
    private String target = "";
    private int repeat;
    private static final int THREAD_POOL = 30;

    public GreaterEx9(String target, int repeat) {
        this.target = target;
        this.repeat = repeat;

    }
    public void run(){
        for (int i=0; i<repeat; i++) {
            System.out.println("hello dear " + target);
        }
    }

    public static void runTogether(Runnable... tasks) {
        ExecutorService executor = Executors.newFixedThreadPool(THREAD_POOL);

        for (Runnable task : tasks) {
            System.out.println("running task: " + task);
            executor.execute(task);
        }

    }
    public static void runInOrder(Runnable... tasks) {
        for (Runnable task : tasks) {
            task.run();
        }
    }


    public static void main(String[] args) {
        Runnable greater1 = new GreaterEx9("Vika", 100);
        Runnable greater2 = new GreaterEx9("Myroslav", 50);
        System.out.println("Run in order: ");
        GreaterEx9.runInOrder(greater1, greater2);
        System.out.println("Run together: ");
        GreaterEx9.runTogether(greater1, greater2);
    }
}
