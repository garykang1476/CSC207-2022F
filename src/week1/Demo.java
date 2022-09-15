package week1;


import java.sql.SQLOutput;
import java.util.ArrayList;

// commit + push
public class Demo {
    public static void main(String[] args) {
        // System.out.println("This is the updated version!!!");

//        int a = 13;
//        Integer b = new Integer(13);
//        Integer c = new Integer(13);
//
//        System.out.println(b == c);  // python is
//        System.out.println(b.equals(c));    // python __eq__
//        System.out.println(a == c);  // unboxing:  c converted to int
//        System.out.println(c.equals(a)); // auto boxing.  a converted to Integer
        // System.out.println(a.equals(c));
//        Integer temp1 = Integer.valueOf(15);
//        Integer temp2 = Integer.valueOf(15);
//
//        System.out.println(temp1 == temp2);

//        String s1 = new String("Gary");
//        String s2 = "Gary";
//        System.out.println(s1 == s2);
//        String s3 = "Gary";
//        System.out.println(s2 == s3);
//        String s4 = new String("Gary");
//        System.out.println(s4 == s2);

//        String[] students = new String[20];
//        students[0] = "Kiki";
//        students[1] = "Joy";
//        System.out.println(students[10]); // null
//
////        int[] l = new int[20];
////        System.out.println(l[5]);
//
//        int[] l = {1,2,3,4,5};
//
//        for(int a : l){
//            System.out.println(a);
//        }
//
//        ArrayList<Integer> l2 = new ArrayList<>();  // items in l2 are not consecutive

        Car c1 = new Car("BMW", 50);
        System.out.println(c1.getName());
        System.out.println(c1.getPrice());

    }
}
