package com.gera.javacore.exercises.Chapter4;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 12.01.18
 * Time: 9:37
 * To change this template use File | Settings | File Templates.
 */
public class ItemEx6Chapter4 {
    protected double price;
    protected String description;

    public ItemEx6Chapter4(double price, String description){
        this.price = price;
        this.description = description;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!(otherObject instanceof ItemEx6Chapter4)) return false;
        ItemEx6Chapter4 other = (ItemEx6Chapter4) otherObject;
        return this.price == other.price && this.description.equals(other.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description);
    }
}
