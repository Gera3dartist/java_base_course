package com.gera.javacore.exercises.Chapter6;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 08.02.18
 * Time: 1:36
 * ---------------------------------
 * Ex1
 * Реализуйте обобщенный класс Stack<E>, управляющий списочным масси­
 вом, состоящим из элементов типа Е. Предоставьте методы push(), рор()
 isEmpty().
 */
public class Ex1<E> {
    ArrayList<E> stack;

    public Ex1(){
        stack = new ArrayList<>();
    }


    public void push(E item) {
        stack.add(item);
    }

    public E pop() {
        E value;
        try {
            value = stack.get(0);
            stack.remove(0);
        } catch (IndexOutOfBoundsException ex) {
            return null;
        }
        return value;

    }

    public static void main(String[] args) {
        Ex1<String> stack = new Ex1<>();
        stack.push("foo bar");
        stack.pop();
        stack.pop();
    }
}
