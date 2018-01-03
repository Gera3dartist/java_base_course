package com.gera.javacore.exercises.Chapter3;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 20:01
 * To change this template use File | Settings | File Templates.
 */
public class GreaterEx8 implements Runnable {
    private String target = "";
    private int repeat;

    public GreaterEx8(String target, int repeat) {
        this.target = target;
        this.repeat = repeat;

    }
    public void run(){
        for (int i=0; i<repeat; i++) {
            System.out.println("hello dear " + target);
        }
    }

    public static void main(String[] args) {
        Runnable greater1 = new GreaterEx8("Vika", 4);
        Runnable greater2 = new GreaterEx8("Myroslav", 3);
        Thread thread1 = new Thread(greater1);
        Thread thread2 = new Thread(greater2);
        thread1.start();
        thread2.start();
    }
}
