package com.gera.javacore.exercises.Chapter7;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 17:02
 * To change this template use File | Settings | File Templates.
 */

public class Memoizer<T, U> {

    private final Map<T, U> cache = new ConcurrentHashMap<>();

    private Memoizer() {}

    private Function<T, U> doMemoize(final Function<T, U> function) {
        return input -> cache.computeIfAbsent(input, function::apply);
    }

    public static <T, U> Function<T, U> memoize(final Function<T, U> function) {
        return new Memoizer<T, U>().doMemoize(function);
    }
}