package flowers;
import lombok.Setter;
import lombok.Getter;

public class Flower {
    @Setter @Getter
    private int sepalLength;
    @Setter @Getter
    private String Color;
    @Setter @Getter
    private int price;

    public int getPrice() {
        return this.price;
    }

    public void setColor(FlowerColor color) {
        this.Color = color.getColor();
    }
}

