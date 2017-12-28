package com.gera.javacore.exercises.Chapter2;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 27.12.17
 * Time: 16:30
 * To change this template use File | Settings | File Templates.
 */
public final class Exercise5_6 {  // a.k.a "Point"
    private double x = 0;
    private double y = 0;

    public static void main(String[] args) {
//        Exercise5_6 point = new Exercise5_6(1, 2).translate(1, 2).scale(0.5);
        Exercise5_6 point = new Exercise5_6(1, 2).translateAccessor(1, 2).scaleAccessor(0.5);
        System.out.println("point x position: " + point.getX());
        System.out.println("point Y position: " + point.getY());
    }

    @Override
    public String toString() {
        return "Exercise5_6{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public Exercise5_6(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Exercise5_6() { // maybe redundant because of defaults
        x = 0;
        y = 0;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    private void setX(double value) {
        x = value;
    }

    private void setY(double value) {
        y = value;
    }

    /**
     * Translates position on <code>x</code> an <code>y</code> coordinates
     * @param coef coefficient of scale
     */
    public Exercise5_6 scale(double coef){
        setX(getX() * coef);
        setY(getY() * coef);
        return this;
    }

    /**
     * Translates position on <code>x</code> an <code>y</code> coordinates
     * @param x translation on x axis
     * @param y translation on y axis */
     public Exercise5_6 translate(double x, double y) {
        setX(getX() + x);
        setY(getY() + y);
        return this;
    }

    /**
     * accessor scale
     * */
    public Exercise5_6 scaleAccessor(double coef) {
        Exercise5_6 point = new Exercise5_6();
        point.setX(getX() * coef);
        point.setY(getY() * coef);
        return point;
    }

    /**
     * accessor translate*/
    public Exercise5_6 translateAccessor(double x, double y) {
        Exercise5_6 point = new Exercise5_6();
        point.setX(getX() + x);
        point.setY(getY() + y);
        return this;
    }





}
