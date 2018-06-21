package com.gera.javacore.exercises.Chapter7;

import java.util.LinkedHashMap;
import java.util.function.Function;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 22.04.18
 * Time: 15:27
 * To change this template use File | Settings | File Templates.
 */
public class CacheEx13<K,V> {
    private final LinkedHashMap<K, V> cache;

    public CacheEx13(int initialCapacity) {
        this.cache = new LinkedHashMap<>(initialCapacity);
    }

    private Function<K, V> doMemoize (final Function<K, V> func) {
        return input -> bridge(func, input);
    }

    private V bridge(Function<K, V> func, K input) {
        System.out.println("Accessing cache: value - " + input);
        System.out.println("cache size: " + cache.keySet().size());
        System.out.println("cache keys: " + cache.keySet());
        return cache.computeIfAbsent(input, func::apply);
    }
    public static <K,V> Function<K, V> memoize(final Function<K, V> func, int cacheSize) {
        return new CacheEx13<K, V>(cacheSize).doMemoize(func);
    }

    public LinkedHashMap<K, V> getCache() {
        return cache;
    }
}
