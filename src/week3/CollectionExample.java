package week3;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        List<String> l2 = new Vector<>();


        Map<Integer, String> m = new HashMap<>();

        m.put(1, "Gary");
        m.put(2, "Alex");
        m.put(3, "Amy");
        System.out.println(m.get(3));

    }



}
