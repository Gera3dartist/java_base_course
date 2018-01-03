package com.gera.javacore.exercises.Chapter3;

import java.io.File;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 30.12.17
 * Time: 20:33
 * To change this template use File | Settings | File Templates.
 */
public class SubdirecroiesListerEx10 {
    public static void main(String[] args) {
        File[] directories = new File("").listFiles(File::isDirectory);
    }

    public static File[] getDirsLambda(String path) {
        return new File(path).listFiles(item->item.isDirectory());
    }

    public static File[] getDirsMethodReference(String path) {
        return new File(path).listFiles(File::isDirectory);
    }
}
