package com.example.demo.item;

public class PaperDecorator extends ItemDecorator{
    Item item;

    double getPrice() {
        return 13 + item.price();
    }

    @Override
    public String getDescription() {
        return item.getDescription() + "is packed in this  paper";
    }

    @Override
    double price() {
        return getPrice();
    }
}
