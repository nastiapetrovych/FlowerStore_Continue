package com.example.demo.item;
import com.example.demo.flower.Flower;

import java.util.List;

public class FlowerBucket extends Item{
    List<Flower> flowers;
    @Override
    double price() {
        int total = 0;
        for(int i = 0; i < flowers.size(); i++){
            total += flowers.get(i).getPrice();
        }
        return total;
    }
    public void searchFlower(Flower flower){
        System.out.println("Searching for flower....");
        if (flowers.contains(flower)){
            System.out.println("The flower is found" );
        }
        else{
            System.out.println("Oops, this flower is out...");
        }
    }
    public void addFlowers(Flower flower){
        flowers.add(flower);
        System.out.println("New flower was added to bucket");
    }
}
