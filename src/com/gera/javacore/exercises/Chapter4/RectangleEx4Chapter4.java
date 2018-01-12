package com.gera.javacore.exercises.Chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 11.01.18
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class RectangleEx4Chapter4 extends ShapeAbstractEx4Chapter4  implements Cloneable {
    private double width;
    private double height;

    public RectangleEx4Chapter4(PointEx1Chapter4 topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;

    }

    @Override
    public PointEx1Chapter4 getCenter() {
        return super.getPoint();
    }

    @Override
    /**
     * Clone return new instance of based on current instance
     * */
    public RectangleEx4Chapter4 clone() {
        return new RectangleEx4Chapter4(getCenter(), width, height);

    }
}
