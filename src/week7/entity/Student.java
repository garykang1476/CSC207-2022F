package week7.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private int id;
    private String name;
    private int level;
    static int count;

    public Student(int id, String name, int level) {
        this.id = id;
        this.name = name;
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
