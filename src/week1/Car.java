package week1;

public class Car {

    // attributes (fields)
    private String name;
    private int price;
    static int count;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
        count++;
    }

    public Car(String name){
        this.name = name;
        price = name.length();
        count++;
    }


    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(Car.count);
        Car c1 = new Car("BMW", 50);
        System.out.println(Car.count);
        Car c2 = new Car("mingzihenchang");
        System.out.println(c2.count);

    }

}
