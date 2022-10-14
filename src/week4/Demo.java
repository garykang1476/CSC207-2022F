package week4;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

//        String a = new String("Gary");
//        List<String> lst = new ArrayList<>();

//        int[] l1 = new int[20];
//        Integer[] l2 = new Integer[20];
//
//        System.out.println(l1[3]); // 0
//        System.out.println(l2[3]); // null
//
//
//        int num1 = 13;
//        Integer num2 = new Integer(13);
//        Integer num3 = new Integer(13);
//
//        System.out.println(num1 == num2);  // num2 convert to int...
//        System.out.println(num2.equals(num1));  // convert num1 from int to Integer (Object)
//        foo(num1);  // this will autobox
//
//        System.out.println(num2 == num3); // this compares ID, returns False.
//
//        Integer num4 = 12;
//        Integer num5 = 12;
//
//        System.out.println(num4 == num5); // true..
//
//
//        String s1 = "Gary";  // this enters string pool...
//        String s2 = "Gary";
//        String s3 = "Gary";
//        String s4 = "Gary";


        A a = new A();
        B b = new B();
        C c = new C();
        A other = new B();

        System.out.println(((A) b).name);
        System.out.println(b.name);
        System.out.println(((B) other).name);
        // System.out.println(((C) other).name);
        // System.out.println(((C) b).name);

        System.out.println(boo(b));
        System.out.println(boo2((B) other));




    }


    static String boo(A item){
        return null;
    };

    static String boo2(B item){
        return null;
    };



    static void foo(Integer num){

    }




}
