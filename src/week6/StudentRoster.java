package week6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class StudentRoster implements Iterable<Student>{

    private List<Student> students = new ArrayList<>();

    void addStudent(Student s){
        students.add(s);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator() ;
    }


    private class StudentIterator implements Iterator<Student>{
        private int current;


        @Override
        public boolean hasNext() {
            return current < students.size();
        }

        @Override
        public Student next() {
            if(hasNext()){
                return students.get(current ++);
            }
            throw new NoSuchElementException();
        }
    }

}
