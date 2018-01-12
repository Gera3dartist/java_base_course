package com.gera.javacore.exercises.Chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 12.01.18
 * Time: 10:08
 * To change this template use File | Settings | File Templates.
 */
public enum ColorsEx7Chapter4 {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;

    public static ColorsEx7Chapter4 getRed() {
        return RED;
    }

    public static ColorsEx7Chapter4 getGreen() {
        return GREEN;
    }

    public static ColorsEx7Chapter4 getBlue() {
        return BLUE;
    }

    public static void main(String[] args) {
        System.out.println(ColorsEx7Chapter4.getBlue());
        System.out.println(ColorsEx7Chapter4.getRed());
        System.out.println(ColorsEx7Chapter4.getGreen());
    }


}
