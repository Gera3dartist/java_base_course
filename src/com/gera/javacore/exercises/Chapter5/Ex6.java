package com.gera.javacore.exercises.Chapter5;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 29.01.18
 * Time: 23:20
 *
 * Exercise 5
 *
 * To change this template use File | Settings | File Templates.
 * В разделе 5.1.6 приведен пример ошибочного внедрения блока операторов
 c a t c h и f i n a l l y в блок кода оператора t r y . Исправьте этот код, во-первых, пе­
 рехватив исключение в операторе f i n a l l y , во-вторых, внедрив блок операто­
 ров t r y / f i n a l l y в блок операторов t ry / c a t c h , и в-третьих, применив оператор
 t r y с ресурсами вместе с оператором c a tc h
 */
public class Ex6 {
    public static void main(String[] args) {
        String path = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\file-data";
        handleException(path);
    }
    public static void handleException(String path) {
        BufferedReader in = null;
        try {
            try {
                Path _path = Paths.get(path, "numbers.txt");
                in = Files.newBufferedReader(_path, StandardCharsets.UTF_8);
                String line = null;
                while ((line = in.readLine()) != null) {
                    System.out.println(">>> " + line);
                }
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (IOException e) {
            System.err.print("Caught exception: " + e.getMessage());
        }
    }
}
