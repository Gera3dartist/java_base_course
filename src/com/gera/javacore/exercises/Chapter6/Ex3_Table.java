package com.gera.javacore.exercises.Chapter6;


import java.util.ArrayList;

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
public class Ex3_Table<K,V> {
    private ArrayList<Ex3_Entry> records;

    public Ex3_Table() {
        records = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    private Ex3_Entry<K,V> findByKey(K key){
        if (records != null) {
            for (Ex3_Entry<K,V> item : records) {
                if (item.getKey() != key){continue;}
                return item;
            }
        }
        return null;
    }

    public Ex3_Entry<K,V> getItem(K key) {
        return findByKey(key);
    }

    public void updateItem(K key, V value) {
        Ex3_Entry<K,V> item = findByKey(key);
        if (item != null) {item.setValue(value);}
    }

    public void deleteItem(K key) {
        Ex3_Entry<K,V> item = findByKey(key);
        if (item != null) {records.remove(item);}
    }

    @SuppressWarnings("unchecked")
    public void addItem(K key, V value) {
        Ex3_Entry<K,V> item = findByKey(key);
        if (item == null) {
            records.add(new Ex3_Entry(key, value));
        }

    }


    public static void main(String[] args) {
        Ex3_Table<String, Integer> table  = new Ex3_Table<>();
        table.addItem("key1", 1);
        table.addItem("key2", 2);
        table.addItem("key3", 3);
        table.deleteItem("key3");
        System.out.println("test passes: " + (table.findByKey("key3")==null));
        table.updateItem("key2", 10);
        System.out.println(">>value is: " + table.findByKey("key2").getValue());
    }




}
