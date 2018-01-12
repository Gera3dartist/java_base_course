package com.gera.javacore.exercises.Chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 11.01.18
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class CircleEx4Chapter4 extends ShapeAbstractEx4Chapter4
    implements Cloneable {
    private double radius;

    public CircleEx4Chapter4(PointEx1Chapter4 center, double radius) {
        super(center);
        this.radius = radius;

    }

    @Override
    public PointEx1Chapter4 getCenter() {
        return super.getPoint();
    }

    /**
     * Clones instance of current class
     * Used method from clone() from Object class
     * @return CircleEx4Chapter4
     * */
    @Override
    public CircleEx4Chapter4 clone() throws CloneNotSupportedException {
        return (CircleEx4Chapter4) super.clone();
    }
}
