package com.gera.javacore.exercises.Chapter3;

import jdk.nashorn.internal.parser.Scanner;

import javax.imageio.stream.ImageOutputStream;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 14:08
 * To change this template use File | Settings | File Templates.
 */
public class EmployeeEx1_2 implements MeasurableEx1 {
    private double salary;
    private double bonuses;

    public EmployeeEx1_2(double salary, double bonuses) {
        this.salary = salary;
        this.bonuses = bonuses;
    }

    @Override
    public double getMeasure() {
        return salary + bonuses;
    }

    public double getSalary() {
        return salary;
    }

    public static double average(MeasurableEx1 [] measurables) {
        double sum = 0;
        for (MeasurableEx1 item: measurables) {
            sum += item.getMeasure();
        }
        return sum/measurables.length;
    }

    public static MeasurableEx1 largest(MeasurableEx1 [] measurables) {
        EmployeeEx1_2 max = (EmployeeEx1_2) measurables[0];

        for (MeasurableEx1 item: measurables)  {
//            EmployeeEx1_2 foo  = (EmployeeEx1_2) item;
            EmployeeEx1_2 foo  = (EmployeeEx1_2) item;
            if (max.getSalary() < foo.getSalary()) {
                max = foo;
            }
        }
        System.out.printf("max is: %.2f", max.getSalary());
        return max;
    }

    public static void main(String[] args) {
        EmployeeEx1_2 em1 = new EmployeeEx1_2(340, 20);
        EmployeeEx1_2 em2 = new EmployeeEx1_2(540, 40);
        EmployeeEx1_2 em3 = new EmployeeEx1_2(140, 30);
        MeasurableEx1 [] all = new MeasurableEx1[]{em1, em2, em2};
        System.out.printf("average is: %.2f", average(all));
        largest(all);
    }
}
