package com.gera.javacore.exercises.Chapter2;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Gera
 * Date: 28.12.17
 * Time: 15:43
 * To change this template use File | Settings | File Templates.
 */
public class Invoice {
    private static class Item {
        private String description;
        private int quantity;
        private double unitPrice;

        public Item (String description, int qunatity, double unitPrice) {
            this.description = description;
            this.quantity = qunatity;
            this.unitPrice = unitPrice;
        }

        public double price() {return quantity * unitPrice;}

    }
    ArrayList<Item> items = new ArrayList<>();

    public void add(Item item) {items.add(item);}

    public void showInvoice() {
        System.out.println("Invoice App version: 1.0.1");
        for (Item item : items) {
            System.out.println("---------------------------------");
            System.out.println("description: " + item.description + ", qunantity: " + item.quantity + ", price: " + item.unitPrice);
        }
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice();
        invoice.add(new Item("cool router", 1, 3500));
        invoice.add(new Item("electric chain saw", 1, 3600));
        invoice.showInvoice();
    }


}
