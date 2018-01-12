package com.gera.javacore.exercises.Chapter4;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 11.01.18
 * Time: 8:54
 * To change this template use File | Settings | File Templates.
 */
public class LabeledPointEx2Chapter4 extends PointEx1Chapter4 {
    private String label;

    public LabeledPointEx2Chapter4(String label, double x, double y) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LabeledPointEx2Chapter4 that = (LabeledPointEx2Chapter4) o;

        return Objects.equals(label, that.getLabel())
                && Objects.equals(getX(), that.getX())
                && Objects.equals(getY(), that.getY());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLabel(), getX(), getY());
    }

    @Override
    public String toString() {
        return "LabeledPointEx2Chapter4{" +
                "label='" + getLabel() + '\'' +
                "X='" + getX() + '\'' +
                "Y='" + getY() + '\'' +
                '}';
    }
}
