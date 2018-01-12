package com.gera.javacore.exercises.Chapter4;

import java.util.Objects;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 12.01.18
 * Time: 9:37
 * To change this template use File | Settings | File Templates.
 */
public class DiscountItemEx6Chapter4 extends ItemEx6Chapter4 {
    private double discount;

    public DiscountItemEx6Chapter4(double price, String description, double discount) {
        super(price, description);
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) throws ClassCastException {
        if (o instanceof ItemEx6Chapter4){
            return super.equals(o);
        }
        if (o == null || getClass() != o.getClass()) return false;


        DiscountItemEx6Chapter4 that = (DiscountItemEx6Chapter4) o;

        return (Double.compare(that.discount, discount) == 0
                && description.equals(that.description)
                && Double.compare(price, that.price) == 0);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, discount, description);
    }

    public static void main(String[] args) throws ClassCastException{
        DiscountItemEx6Chapter4 ditem1 = new DiscountItemEx6Chapter4(1, "board", 0.2);
        DiscountItemEx6Chapter4 ditem2 = new DiscountItemEx6Chapter4(1, "board", 0.2);
        DiscountItemEx6Chapter4 ditem3 = new DiscountItemEx6Chapter4(3, "board", 0.2);

        ItemEx6Chapter4 item1 = new ItemEx6Chapter4(1, "board");
        ItemEx6Chapter4 item3 = new ItemEx6Chapter4(2, "board");

        System.out.println("ditem1 equals item1 " + ditem1.equals(item1));
        System.out.println("item1 equals ditem1 " + item1.equals(ditem1));
        System.out.println("ditem1 not equals ditem3 " + ditem1.equals(ditem3));
        System.out.println("ditem1 equals ditem2 " + ditem1.equals(ditem2));

    }
}
