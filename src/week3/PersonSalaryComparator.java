package week3;

import java.util.Comparator;

public class PersonSalaryComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSalary() == o2.getSalary() ){
            return 0;
        }
        else if(o1.getSalary() > o2.getSalary()){
            return 1;
        }
        else{
            return -1;
        }
    }
}
