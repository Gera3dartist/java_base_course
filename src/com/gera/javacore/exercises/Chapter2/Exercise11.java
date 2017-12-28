package com.gera.javacore.exercises.Chapter2;

import java.time.LocalDate;

import static java.time.LocalDate.of;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 28.12.17
 * Time: 13:26
 * To change this template use File | Settings | File Templates.
 */
public class Exercise11 {
    private static enum Days {
        Sun, Mon, Tue, Wed, Thu, Fri, Sut
    }

    public static void main(String[] args) {
        int month = 12;
        int lastDay = 7;
        LocalDate startDate = of(2017, month, 1);
        for (Days item: Days.values()) {
            System.out.printf("%5s", item);
        }
        System.out.println();
        // define offset considering Sunday to be the first day
        for (int i=startDate.getDayOfWeek().getValue(); i>0; i--) {
            if (i==lastDay) {
                break;
            }

            System.out.printf("%5s", " ");
        }

        // output days
        while(startDate.getMonthValue() == month){
            System.out.printf("%5d", startDate.getDayOfMonth());
            if (startDate.getDayOfWeek().getValue() == 6){
                System.out.println();
            }
            startDate = startDate.plusDays(1);
        }
    }
}
