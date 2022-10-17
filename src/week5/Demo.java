package week5;

public class Demo {

    private static int areaCount;


    public static double getArea(double x, double y){
        areaCount += x * y;
        return x * y;
    }

    public int dummyMethod(int m){
        if (m > 50){
            return 1;
        }
        else if (m % 2 == 1){
            return 2;
        }
        else if (m == 0){
            throw new IllegalArgumentException();
        }
        else {
            return 4;
        }
    }

    public static int getAreaCount() {
        return areaCount;
    }
}
