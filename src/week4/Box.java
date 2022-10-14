package week4;

public class Box {

    private int serialNum;
    private int height;
    private int weight;
    private String color;
    static int count;   // after compile... assign 0 to count

    public Box(int serialNum, int height, int weight, String color) {
        this.serialNum = serialNum;
        this.height = height;
        this.weight = weight;
        this.color = color;
        count ++;
    }

    public Box(){
        this.serialNum = count ++;
        this.height = 1;
        this.weight = 1;
        this.color = "Default";
    }

    @Override
    public int hashCode() {
        return serialNum;  //unique identifier...
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Box box = (Box) o;   // casting.....

        if (height != box.height) return false;
        if (weight != box.weight) return false;
        return color != null ? color.equals(box.color) : box.color == null;

    }


    //    static void foo(){
//        this.serialNum;
//    }

    public static void main(String[] args) {
        System.out.println(Box.count);
        Box b1 = new Box(1, 4,4, "Yellow");
        Box b2 = new Box(2, 4,4, "Yellow");
        Box b3 = new Box(1, 7,7, "Red");
        Box b4 = new Box();
        System.out.println(b1.count);

    }
}
