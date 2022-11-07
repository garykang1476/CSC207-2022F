package week7.gateway;

import week7.entity.Student;
import week7.usecase.StudentRepositoryGateway;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepostoryImpl implements StudentRepositoryGateway {

    private static final String FILE_NAME = "students.sav";

    @Override
    public List<Student> getStudents() throws IOException {

        FileInputStream f2 = new FileInputStream("students.sav");
        ObjectInputStream inputStream = new ObjectInputStream(f2);
        try {
            List<Student> newStudents = (ArrayList<Student>) inputStream.readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        f2.close();
        return null;
    }

    @Override
    public void saveStudent(List<Student> students) throws IOException {

        FileOutputStream f = new FileOutputStream(FILE_NAME);
        ObjectOutputStream outputStream = new ObjectOutputStream(f);
        outputStream.writeObject(students);
        f.close();

    }
}
