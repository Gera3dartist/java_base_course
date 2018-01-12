package com.gera.javacore.exercises.Chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 11.01.18
 * Time: 22:33
 * To change this template use File | Settings | File Templates.
 */
public abstract class ShapeAbstractEx4Chapter4 {
    private PointEx1Chapter4 point;

    public ShapeAbstractEx4Chapter4(PointEx1Chapter4 point) {
        this.point = point;
    }

    public PointEx1Chapter4 getPoint() {
        return point;
    }

    public void setPoint(PointEx1Chapter4 point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.setX(point.getX() + dx);
        point.setY(point.getY() + dy);
    }

    public abstract PointEx1Chapter4 getCenter();
}
