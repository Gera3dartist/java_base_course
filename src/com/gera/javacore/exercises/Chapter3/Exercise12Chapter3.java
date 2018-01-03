package com.gera.javacore.exercises.Chapter3;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.01.18
 * Time: 16:23
 * To change this template use File | Settings | File Templates.
 */
public class Exercise12Chapter3 {
    public static void main(String[] args) {
        File [] dirContent = new File(".").listFiles();
        Arrays.sort(dirContent, Comparator.comparing((File file)->!file.isDirectory()).thenComparing(File::getPath));
        System.out.println("output result: ");
        for (File f: dirContent) {
            System.out.println("path: " + f.getPath() + ", is_dir: " + f.isDirectory());
        }

    }

}
