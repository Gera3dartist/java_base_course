package com.gera.javacore.exercises.Chapter5;

import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.01.18
 * Time: 0:41
 * To change this template use File | Settings | File Templates.
 */
public class Ex8 extends ReentrantLock implements AutoCloseable{
    public static void main(String[] args) {
        System.out.println("instance: " + handleException());
    }
    public Ex8() {
        super();
    }

    public static Ex8 handleException() {
        try (Ex8 locker = new Ex8()) {
            System.out.println("...locking");
            locker.lock();
            return locker;

        }  catch ( IOException ex ) {
            // pass
        }
        return null;
    }

    @Override
    public void close() throws IOException {
        unlock();
    }
}
