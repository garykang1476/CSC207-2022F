package week3;

import java.util.ArrayList;
import java.util.Collections;

public class CompareExample {

    public static void main(String[] args) {

        Person p1 = new Person("Gary", 18, 5);
        Person p2 = new Person("Alex", 27, 500);
        Person p3 = new Person("Amy", 32, 3);

        ArrayList<Person> plist = new ArrayList<>();
        plist.add(p1);
        plist.add(p2);
        plist.add(p3);

        plist.sort(new PersonAgeComparator());  // this use comparator
        plist.sort(new PersonSalaryComparator());  // this use comparator


        Collections.sort(plist);  // this use comparable.


    }
}
