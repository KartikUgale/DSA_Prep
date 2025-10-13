import java.util.ArrayList;
import java.util.Collections;

public class ArrayListObjectsSort {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(4, "Ram"));
        students.add(new Student(2, "Raj"));
        students.add(new Student(1, "Sham"));
        students.add(new Student(5, "Rohit"));
        students.add(new Student(3, "Karan"));

        System.out.println(students);

        // Ascending sort
        Collections.sort(students, (a, b) -> a.id - b.id);
        System.out.println(students);

        // descending sort
        Collections.sort(students, (a, b) -> b.id - a.id);
        System.out.println(students);
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "(" + id + ")" + name;
    }
}