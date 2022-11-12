package com.example.demo.item;

public class RibbonDecorator extends ItemDecorator{
    Item item;
    double getPrice() {
        return 40 + item.price();
    }

    @Override
    public String getDescription() {
        return "Ribbon is added to" + item.getDescription();
    }

    @Override
    double price() {
        return getPrice();
    }
}
