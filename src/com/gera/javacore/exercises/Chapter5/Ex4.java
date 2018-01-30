package com.gera.javacore.exercises.Chapter5;


import java.io.File;
import java.io.FileNotFoundException;
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
 * Повторите предыдущее упражнение, но на этот раз не пользуйтесь исключени­
 ями. Вместо этого организуйте возврат кодов ошибок из методов r e a d V a lu e s ()
 и s u m O fV a lu e s ().
 */
public class Ex4 {
    public static void main(String[] args) throws Exception{
        Ex4 reader = new Ex4();
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
            System.exit(1);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.exit(2);
        }
        return sum;


    }

}
