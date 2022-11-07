package week7.usecase;

import week7.entity.Student;
import week7.gateway.StudentRepostoryImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRegistryUsecase {

    private StudentRepositoryGateway srg = new StudentRepostoryImpl();
    private List<Student> students;

    public StudentRegistryUsecase() {

        try {
            students = srg.getStudents();
        } catch (IOException e) {
            students = new ArrayList<>();
            System.out.println("Readfile failed.....");
        }
    }


    public void registerNewStudent(Student student){
        students.add(student);
        try {
            srg.saveStudent(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
