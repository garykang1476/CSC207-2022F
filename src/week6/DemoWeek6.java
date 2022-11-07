package week6;

import java.io.*;
import java.util.*;

public class DemoWeek6 {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Student s1 = new Student(1, "Gary", 9);
        Student s2 = new Student(1, "Christina", 2);
        Student s3 = new Student(1, "Gillian", 1);

//        List<Student> students = new ArrayList<>();
//        students.add(s1);
//        students.add(s2);
//        students.add(s3);
//
//        FileOutputStream f = new FileOutputStream("students.sav");
//        ObjectOutputStream outputStream = new ObjectOutputStream(f);
//        s3.count = 10;  // Student.count = 10;
//
//        outputStream.writeObject(students);
//
//        f.close();
//
//        FileInputStream f2 = new FileInputStream("students.sav");
//        ObjectInputStream inputStream = new ObjectInputStream(f2);
//        List<Student> newStudents = (ArrayList<Student>) inputStream.readObject();
//
//        f2.close();
//
//        for(Student s: newStudents){
//            System.out.println(s);
//        }
//
//        System.out.println(Student.count);
//
//    StudentMenu sm = new StudentMenu();
//    sm.addStudent(s1);
//    sm.addStudent(s2);
//    sm.addStudent(s3);
//
//
//    Iterator<List<Student>> iterator = sm.iterator();
//
//    /// clicked.. button....
//        if (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        Trump trump = Trump.getTrump();


    }


}
