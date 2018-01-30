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
 * Exercise 1
 *
 * Напишите метод p u b l i c A r r a y L i s t < D o u b l e > r e a d V a lu e s ( S t r i n g f ile n a m e )
 * t h r o w s ..., читающий числа с плавающей точкой из файла. Сгенерируйте
 * подходящие исключения, если файл не удается открыть или же если введены
 * данные, не относящиеся к числам с плавающей точкой.
 */
public class Ex1 {
    public static void main(String[] args) throws IOException{
        Ex1 reader = new Ex1();
        String fname = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data\\numbers.txt";
        for (Double el : reader.readValue(fname)) {
            System.out.println("result: " + el);
        }
    }
    public ArrayList<Double> readValue(String fileName) throws IOException {
        ArrayList<Double> result  = new ArrayList<Double>();
        try (Scanner scanner = new Scanner (new File(fileName))) {
            while (scanner.hasNext()) {
                Arrays.stream(scanner.nextLine().split(", "))
                        .mapToDouble(Double::parseDouble)
                        .forEach(item->result.add(item));
            }
        }

        return result;


    }

//    public static parseValues(Stream<String>)result
}
