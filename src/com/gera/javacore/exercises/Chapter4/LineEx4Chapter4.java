package com.gera.javacore.exercises.Chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 11.01.18
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class LineEx4Chapter4 extends ShapeAbstractEx4Chapter4  implements Cloneable{
    private PointEx1Chapter4 pointTo;

    public LineEx4Chapter4(PointEx1Chapter4 from, PointEx1Chapter4 to) {
        super(from);
        this.pointTo = to;
    }

    @Override
    public PointEx1Chapter4 getCenter() {
        return super.getPoint();
    }

    @Override
    public LineEx4Chapter4 clone() throws CloneNotSupportedException{
        return (LineEx4Chapter4) super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        LineEx4Chapter4 inst = new LineEx4Chapter4(new PointEx1Chapter4(0, 0), new PointEx1Chapter4(2, 3));
        LineEx4Chapter4 cloned = inst.clone();
        System.out.println(inst);
        System.out.println(cloned);
    }

}
