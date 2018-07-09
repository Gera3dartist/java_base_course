package com.gera.javacore.exercises.Chapter8;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 07.07.18
 * Time: 17:29
 * To change this template use File | Settings | File Templates.
 *
 * Организуйте вызов метода r e d u c e () таким образом,
 * чтобы вычислить среднее в потоке данных Stream <Double>.
 * Почему нельзя просто вычислить сумму и разделить ее на результат,
 * возвращаемый методом c o u n t () ?
 */
public class Ex14 {

    private double value;
    private double count;

    public Ex14 () {
        this.count = 0.0;
        this.value = 0.0;
    }

    public Ex14 (double value, double count) {
        this.count = count;
        this.value = value;
    }

    public Ex14 accept(double item) {
//        return new Ex14(item1 + item, 2);
        return new Ex14(this.value + item, this.count + 1.0);
    }

    public double average() {return count > 0 ? value/count : 0;}

    public Ex14 combine(Ex14 other){
        return new Ex14(value + other.value,  count + other.count);
    }


    public static void main(String[] args) {
        OptionalDouble res  = DoubleStream.of(1.0, 2.0, 4.0, 12.0, 23.0).average();

        System.out.println("average is: " + res);
        Double res1  = Stream
                .of(1.0, 2.0, 4.0, 12.0, 23.0)
                .parallel()
                .reduce(new Ex14(),
                        (x,y) -> x.accept(y),
                        (x,y) -> x.combine(y)
                        )
                .average();
        System.out.println("average2 is: " + res1);
    }

    public static void test1() {
        OptionalDouble res  = DoubleStream.of(1.0, 2.0, 4.0, 12.0, 23.0).average();

        System.out.println("average is: " + res);
        Map<String, Double> mp = new HashMap<>();
        mp.put("amount", 0.0);
        mp.put("count", 0.0);
        Double res1  = DoubleStream
                .of(1.0, 2.0, 4.0, 12.0, 23.0)
                .parallel()
                .reduce(0,
                        (x,y) -> {
                            mp.put("amount", mp.get("amount") + x + y);
                            mp.put("count", mp.get("count") + 2);
                            return x+y;
                        });
        System.out.println("average2 is: " + res1);
        System.out.println("average from map is: " + mp.get("amount")/mp.get("count"));
    }
}
