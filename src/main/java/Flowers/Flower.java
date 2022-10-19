package Flowers;
import lombok.Setter;
import lombok.Getter;

public class Flower {
    @Setter
    int sepalLength;
    @Setter @Getter
    String Color;
    @Setter
    int price;

    public int getPrice() {
        return this.price;
    }

    public void setColor(FlowerColor color) {
        this.Color = color.getColor();
    }
}

