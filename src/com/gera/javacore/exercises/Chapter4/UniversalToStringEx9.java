package com.gera.javacore.exercises.Chapter4;

import java.lang.reflect.Field;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 13.01.18
 * Time: 18:34
 * Example of Reflection
 */

public class UniversalToStringEx9 {
    private Double salary;
    private String name;

    public UniversalToStringEx9(Double salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("------Introspection-----\n");
        for (Field f: this.getClass().getDeclaredFields()){
            f.setAccessible(true);
            try {
                Object value = f.get(this);
                sb.append(f.getName() + ": " + value.toString() + ", ");
            } catch (IllegalAccessException ex){
                continue;
            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        UniversalToStringEx9 inst = new UniversalToStringEx9(1000.0, "Stepan");
        System.out.println(inst);

    }
}


