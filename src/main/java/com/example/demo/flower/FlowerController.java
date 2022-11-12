package com.example.demo.flower;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/api/flowers")
@RestController
public class FlowerController {
    @GetMapping
    public  List<Object> getFlowers() {
        Flower flower = new Flower();
        flower.setPrice(200);
        flower.setPrice(40);
        flower.setFlowerNumber(10);
        return List.of(flower);
    }
}
