package com.gera.javacore.exercises.Chapter5;

import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.01.18
 * Time: 23:47
 * To change this template use File | Settings | File Templates.
 */
public class Ex10 {
    public static void main(String[] args) {
        FileNotFoundException ex = new FileNotFoundException("some message");
        ex.initCause(new FileAlreadyExistsException("cause exception"));
        factorial(ex);
    }
    public static void factorial(Throwable foo) {
        foo.printStackTrace();
        if (foo.getCause() != null){
            factorial(foo.getCause());
        }
    }
}
