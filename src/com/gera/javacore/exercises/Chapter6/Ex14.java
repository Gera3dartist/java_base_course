package com.gera.javacore.exercises.Chapter6;
/*
* Реализуйте усовершенствованный вариант метода c l o s e A l l (),
* представленно го в разделе 6.3. Закройте все элементы даже в том случае, если некоторые из них генерируют исключение.
 * В таком случае сгенерируйте исключение впо следствии.
 * Если исключение генерируется в результате двух
 * или больше вызо вов данного метода, свяжите их в цепочку.
* */

import java.io.IOException;
import java.util.ArrayList;

public class Ex14 {
    public static <T extends AutoCloseable> void closeAll(ArrayList<T> items) throws Exception {
        for (T item: items) {
            try {
                item.close();
            } catch (Throwable e) {
                throw new IOException("Decorated message", e);
            }

        }
    }
}
