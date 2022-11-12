package com.example.demo.flower;
import lombok.Setter;
import lombok.Getter;

public class Flower {
    @Setter @Getter
    private int flowerNumber;
    @Setter @Getter
    private String Color;
    @Setter @Getter
    private int price;

    public int getPrice() {
        return this.price;
    }

}

