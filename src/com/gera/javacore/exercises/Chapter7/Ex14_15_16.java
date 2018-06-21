package com.gera.javacore.exercises.Chapter7;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 15:29
 * To change this template use File | Settings | File Templates.
 */
public class Ex14_15_16 {
    public static List<Integer> getImmutableView(int n, IntFunction func) {
        return Collections.unmodifiableList(IntStream.range(0, n).map((item) -> (Integer)func.apply(item)).boxed().collect(Collectors.<Integer>toList()));
    }

    public static List<Integer> getImmutableView2(int n, Function func) {
        return Collections.unmodifiableList(IntStream.range(0, n).map((item) -> (Integer)func.apply(item)).boxed().collect(Collectors.<Integer>toList()));
    }

    public static void main(String[] args) {
        System.out.println(getImmutableView(100, (item)-> item*2));
        //cached version
        Function<Integer, Integer> f = (item)-> item * 2;
        Function g = CacheEx13.memoize(f, 50);
        System.out.println(getImmutableView2(100, g));

    }

    public void size() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    public Object[] toArray() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

}
