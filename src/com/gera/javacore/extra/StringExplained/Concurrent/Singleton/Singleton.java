package com.gera.javacore.extra.StringExplained.Concurrent.Singleton;

/**
 * @author http://crunchify.com/lazy-creation-of-singleton-threadsafe-instance-without-using-synchronized-keyword/
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */
public class Singleton {
    private Singleton() {
    }

    private static class HoldInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return HoldInstance.INSTANCE;
    }

    public static void main(String[] args) {
        Singleton inst1 = Singleton.getInstance();
        Singleton inst2 = Singleton.getInstance();
        System.out.println("inst1: " + inst1);
        System.out.println("inst2: " + inst2);
    }


}
