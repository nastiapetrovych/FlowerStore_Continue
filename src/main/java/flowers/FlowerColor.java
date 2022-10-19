package flowers;
import lombok.Getter;

public enum FlowerColor {
    RED("#FF0000"), BLUE("#0000FF");

    @Getter
    private final String color;


    FlowerColor(String color) {
        this.color = color;
    }
}
