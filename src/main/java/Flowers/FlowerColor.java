package Flowers;
import lombok.Getter;
import lombok.Setter;


public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");

    @Getter
    private final String color;


    FlowerColor(String color) {
        this.color = (String)color;


    }
}
