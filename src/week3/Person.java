package week3;


public class Person implements Comparable<Person>{

    private String name;
    private int age;
    private int salary;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Person o) {
        if (age == o.age ){
            return 0;
        }
        else if(age > o.age){
            return 1;
        }
        else{
            return -1;
        }
    }




    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}
