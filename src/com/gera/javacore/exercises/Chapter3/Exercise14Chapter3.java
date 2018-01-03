package com.gera.javacore.exercises.Chapter3;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.01.18
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
public class Exercise14Chapter3 {
    public static void main(String[] args) {
        Employee [] employees = {
                new Employee("Stepan", 2000),
                new Employee("Masha", 1800),
                new Employee("Walhala", 1950),
                new Employee("Anton", 1950),
        };

        Arrays.sort(employees, Comparator.comparingDouble(Employee::getSalary).reversed().thenComparing(Employee::getName));

        for (Employee person : employees) {
            System.out.println(person);
        }
    }

    public static class Employee {
        private String name;
        private double salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
    }
}
