package com.gera.javacore.exercises.Chapter6;
/*
*
* совершенствуйте метод public static <V, Т> V doWork(Callable<V> с, T ex) t h r o w s T,
* представленный в разделе 6.6.7, таким образом, чтобы передавать ему объект исключения,
* который вряд ли будет вообще использован.
* Вместо этого данный метод должен принимать ссылку на класс исключения.
*
*
* */

import java.io.IOException;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex22 {
    public interface Collable<V> {
         V doWork();
    }
    public static <V,T extends Throwable> V doWork(Collable<V> c) throws T {
        try {
            throw new Throwable("bad thing happened");
//            return c.doWork();
        } catch (Throwable realEx) {
            System.out.println(">>here");
            throw Ex22.<T>throwAs(realEx);
//            return null;
        }
    }

    @SuppressWarnings("unchecked")
    public static <T extends Throwable> T throwAs(Throwable e) throws T {
        throw (T)e;

    }

    public static void main(String[] args) {
        Ex22.<String,RuntimeException>doWork(()->"work done");
    }
}
