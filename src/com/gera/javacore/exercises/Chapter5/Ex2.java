package com.gera.javacore.exercises.Chapter5;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 27.01.18
 * Time: 11:31
 *
 * Exercise 2
 *
 * Напишите метод p u b l i c d o u b le s u m O fV a lu e s ( S t r i n g f ile n a m e ) t h ro w s . . ., вы­
 зывающий метод из предыдущего упражнения и возвращающий сумму значе­
 ний в файле. Организуйте распространение любых исключений вызывающе­
 му коду.
 */
public class Ex2 {
    public static void main(String[] args) throws Exception{
        Ex2 reader = new Ex2();
        String fname = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data\\numbers.txt";
        System.out.println("result: " + reader.sumOfValues(fname));

    }
    public Double sumOfValues(String fileName) throws Exception {
        ArrayList<Double> result  = new ArrayList<>();
        double sum = 0;
        try (Scanner scanner = new Scanner (new File(fileName))) {
            while (scanner.hasNext()) {
                sum += Arrays.stream(scanner.nextLine().split(", "))
                        .mapToDouble(Double::parseDouble)
                        .sum();
            }
        }
        return sum;


    }

}
