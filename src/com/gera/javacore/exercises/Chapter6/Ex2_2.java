package com.gera.javacore.exercises.Chapter6;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 08.02.18
 * Time: 1:36
 * ---------------------------------
 * Ex1
 * Еще раз реализуйте обобщенный класс Stack<E>, используя массив для хране­
 ния элементов. Если требуется, нарастите массив в методе push (). Предоставь­
 те два решения этой задачи: одно — с массивом типа Е [ ], другое — с массивом
 типа Object [ ]. Оба решения должны компилироваться без всяких предупреж­
 дений. Какое из них вы предпочтете сами и почему?
 */
public class Ex2_2<E> {
    private Object[] stack;
    private int last;

    public void push(Object item) {
        if (stack == null) {
            stack = new Object[2];
            last=0;
        }
        // array initialized
        else if (stack[stack.length-1] != null) {
            //array is full need to copy
            stack = doubleArray();
        }
        stack[last] = item;
        last+=1;
    }

    @SuppressWarnings("unchecked")
    public E pop() {
        Object value = null;
        try {
            last -=1;
            value = stack[last];
            stack[last] = null;
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("WARNING: index not existing fo array");
        }
        return (E) value;

    }

    private Object[] doubleArray(){
        if (stack == null) {
            return stack;
        }
        Object[] newArr = Arrays.copyOf(stack, stack.length*2);
        return newArr;
    }

    public void display() {
        for (Object item: stack) {
            System.out.println(">>Item: " + item);
        }
    }

    public static void main(String[] args) {
        Ex2_2<String> stack = new Ex2_2<>();
        stack.push("foo bar");
        stack.push("foo bar");
        stack.push("foo bar");
        stack.pop();
        stack.pop();
        stack.push("new bar");
        stack.display();
    }
}
