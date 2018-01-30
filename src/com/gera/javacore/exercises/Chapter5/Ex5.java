package com.gera.javacore.exercises.Chapter5;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 28.01.18
 * Time: 14:16
 * To change this template use File | Settings | File Templates.
 *
 * Exercise 5
 *
 *  * Реализуйте метод, содержащий код, где применяются классы S c a n n e r и P r i n t
 W r i t e r (см. раздел 5.1.5). Но вместо оператора t r y с ресурсами воспользуйтесь
 оператором c a tc h . Непременно закройте оба объекта, при условии, что они
 построены надлежащим образом. Для этого вам придется принять во внима­
 ние следующие условия.
 • Конструктор класса Scanner генерирует исключение.
 • Конструктор класса PrintWriter генерирует исключение.
 • Метод h a s N e x t (), n e x t () или p r i n t l n () генерирует исключение.
 • Метод o u t . c l o s e () генерирует исключение.
 • Метод i n . c l o s e () генерирует исключение.
 */
public class Ex5 {
    public static void main(String[] args) {

        String path = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data\\numbers.txt";
        String outPath = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data\\outNumbers.txt";
        handleException(path, outPath);
    }

    public static void handleException(String sourcePath, String outPath) {
        Scanner scan = null;
        PrintWriter printer = null;

        try {
            scan = new Scanner(new File(sourcePath));
            printer = new PrintWriter(outPath);
            while (scan.hasNext()) {
                printer.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            // pass
        } finally {
            if (scan!=null){scan.close();}
            if (printer!=null){printer.close();}
        }
    }
}
