package com.gera.javacore.exercises.Chapter6;


import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 18.02.18
 * Time: 14:49
 * To change this template use File | Settings | File Templates.
 * Сделайте вложенным класс Entry из предыдущего упражнения. Должен ли
 этот класс быть обобщенным?
 */
public class Ex4_Table<K,V> {
    public class Entry<K,V> {
        private K key;
        private V value;

        public Entry(K key, V value) {
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

    private ArrayList<Entry> records;

    public Ex4_Table() {
        records = new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    private Entry<K,V> findByKey(K key){
        if (records != null) {
            for (Entry<K,V> item : records) {
                if (item.getKey() != key){continue;}
                return item;
            }
        }
        return null;
    }

    public Entry<K,V> getItem(K key) {
        return findByKey(key);
    }

    public void updateItem(K key, V value) {
        Entry<K,V> item = findByKey(key);
        if (item != null) {item.setValue(value);}
    }

    public void deleteItem(K key) {
        Entry<K,V> item = findByKey(key);
        if (item != null) {records.remove(item);}
    }

    @SuppressWarnings("unchecked")
    public void addItem(K key, V value) {
        Entry<K,V> item = findByKey(key);
        if (item == null) {
            records.add(new Entry(key, value));
        }
    }


    public static void main(String[] args) {
        Ex4_Table<String, Integer> table  = new Ex4_Table<>();
        table.addItem("key1", 1);
        table.addItem("key2", 2);
        table.addItem("key3", 3);
        table.deleteItem("key3");
        System.out.println("test passes: " + (table.findByKey("key3")==null));
        table.updateItem("key2", 10);
        System.out.println(">>value is: " + table.findByKey("key2").getValue());
    }




}
