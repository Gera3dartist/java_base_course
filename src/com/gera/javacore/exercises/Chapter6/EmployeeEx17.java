package com.gera.javacore.exercises.Chapter6;
/*
*
*
* Определите класс Employee, реализующий интерфейс Comparable<Employee>.
* Используя утилиту javap, продемонстрируйте, что мостовой метод был синте зирован. Каково его назначение?
*
*
*
* */

public class EmployeeEx17 implements Comparable<EmployeeEx17> {
    private int size;

    @Override
    public int compareTo(EmployeeEx17 o) {
        if (size == o.size) {return 0;}
        else if (size > o.size){ return 1;}
        else{ return -1;}
    }

    public static void main(String[] args) {
        System.out.println("foo");
    }
}

