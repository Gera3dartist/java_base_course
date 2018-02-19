package com.gera.javacore.exercises.Chapter6;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 18.02.18
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 * 3. Реализуйте обобщенный класс Table<K, V>, управляющий списочным мас­
 сивом, состоящим из элементов типа Entry<K, V>. Предоставьте методы для
 получения значения, связанного с ключом, установки значения по заданному
 ключу и удаления ключа.
 */
public class Ex3_Entry<K,V> {
    private K key;
    private V value;

    public Ex3_Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;

    }
}
