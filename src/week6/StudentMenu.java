package week6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentMenu implements Iterable<List<Student>> {

    private List<Student> students = new ArrayList<>();
    private int MENU_SIZE = 2;

    void addStudent(Student s){
        students.add(s);
    }

    @Override
    public Iterator<List<Student>> iterator() {
        return new StudentMenuIterator();
    }

    private class StudentMenuIterator implements Iterator<List<Student>>{
        private int current;


        @Override
        public boolean hasNext() {

            Trump t = Trump.getTrump();
            return current < students.size();
        }

        @Override
        public List<Student> next() {

            List<Student> temp = new ArrayList<>();
            while(temp.size() < MENU_SIZE && hasNext()){
                temp.add(students.get(current ++));
            }
            return temp;
        }
    }


}
