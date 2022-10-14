package week3.fileexample;

public class Car implements ICar {

    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toSavableFormat() {
        return name + "," + price;
    }
}
