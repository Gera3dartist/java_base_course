package com.gera.javacore.exercises.Chapter5;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 27.01.18
 * Time: 11:31
 *
 * Exercise 3
 *
 * Напишите программу, вызывающую метод из предыдущего упражнения и
 выводящую полученный результат. Организуйте перехват исключений и пре­
 доставьте ответную реакцию на действия пользователя в виде сообщений о лю­
 бых ошибочных условиях.
 */
public class Ex3 {
    public static void main(String[] args) throws Exception{
        Ex3 reader = new Ex3();
        String fname = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data\\numbers.txt";
        System.out.println("result: " + reader.sumOfValues(fname));

    }
    public Double sumOfValues(String fileName) {
        double sum = 0;
        try (Scanner scanner = new Scanner (new File(fileName))) {
            while (scanner.hasNext()) {
                sum += Arrays.stream(scanner.nextLine().split(", "))
                        .mapToDouble(Double::parseDouble)
                        .sum();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return sum;


    }

}
