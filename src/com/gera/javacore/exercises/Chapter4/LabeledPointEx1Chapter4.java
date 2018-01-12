package com.gera.javacore.exercises.Chapter4;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 11.01.18
 * Time: 8:54
 * To change this template use File | Settings | File Templates.
 */
public class LabeledPointEx1Chapter4 extends PointEx1Chapter4 {
    private String label;

    public LabeledPointEx1Chapter4(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
