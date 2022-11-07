package week7.usecase;

import week7.entity.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface StudentRepositoryGateway {

    List<Student> getStudents() throws IOException;

    void saveStudent(List<Student> students) throws IOException;
}
