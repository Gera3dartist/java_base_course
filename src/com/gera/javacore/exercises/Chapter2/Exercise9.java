package com.gera.javacore.exercises.Chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 27.12.17
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
/**
 * Class embodies an abstract Car
 * */
public class Exercise9 { // aka Car
    private double totalTransition = 0;
    private double fuelLevel = 0;
    private double litrPerKm = 0.07;


    public Exercise9(double litrPerKm) {
        this.litrPerKm = litrPerKm;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    private void setTotalTransition(double totalTransition) {
        this.totalTransition = totalTransition;
    }

    public double getTotalTransition() {

        return totalTransition;
    }

    public void moveKm(double distance) {
        double tripFuel = litrPerKm * distance;
        if (tripFuel > getFuelLevel()) {
            System.out.printf("You'll need to tank after %.1f km", litrPerKm * getFuelLevel());
        }
        else {
            System.out.println("You have enough fuel for the trip");}
        setFuelLevel(getFuelLevel() - (litrPerKm * distance));
        setTotalTransition(getTotalTransition() + distance);
    }

    public static void main(String[] args) {
        Exercise9 jeep = new Exercise9(0.01);
        jeep.setFuelLevel(5);
        jeep.moveKm(250);
    }

}

