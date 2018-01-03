package com.gera.javacore.exercises.Chapter3;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 03.01.18
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public class Exercise11Chapter3 {
    public static void main(String[] args) {
        String path = "X:\\IT_stuff\\Java\\Projects\\java_couse\\java_base_course\\src\\com\\gera\\javacore\\exercises\\Chapter3";
        File[] directories =  filefilter(path, ".java");
        File[] flambdas =  filefilterLambda(path, ".java");
        for(File f : directories) {
            System.out.println(f.getName());
        }
        System.out.println("LAMBDA example:");
        for(File f : flambdas) {
            System.out.println(f.getName());
        }
    }

    public static File[] filefilter(String path, String extension) {
        return new File(path).listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.contains(extension);
            }
        });
    }

    public static File[] filefilterLambda(String path, String extension) {
        return new File(path).listFiles(f-> f.isFile() && f.getName().contains(extension));
    }
}
