package com.gera.javacore.exercises.Chapter6;


import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 18.02.18
 * Time: 16:04
 *
 *
 * public static <Т> Т[] swap(int i, int j, T... values) {
 T temp = values[i];
 * values[i] = values [j];
 * values[j] = temp;
 return values;
 А теперь рассмотрите следующий вызов:
 Doublet] result = Arrays.swap(0, 1, 1.5, 2, 3);
 Какое сообщение об ошибке вы получите? Далее сделайте такой вызов:
 Doublet] result = Arrays.<Double>swap(0, 1, 1.5, 2, 3);
 Изменилось ли к лучшему сообщение об ошибке? Что нужно сделать для
 устранения ошибки?
 */
public class Ex5 {
    private static <T> T[] swap(int i, int j, T... values){
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }
    public static void main(String[] args) {
        Double[] result = Ex5.<Double>swap(0, 1, 1.5, 2.0, 3.0);
    }
}
