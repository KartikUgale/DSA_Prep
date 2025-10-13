import java.util.TreeSet;
import java.util.Set;
import java.util.Collections;

public class HashSetSort {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(9);
        set1.add(89);
        set1.add(5);
        set1.add(3);
        // TreeSet is naturally sorted in ascending order
        System.out.println(set1);

        TreeSet<Integer> set2 = new TreeSet<>(Collections.reverseOrder());
        set2.add(10);
        set2.add(9);
        set2.add(89);
        set2.add(5);
        set2.add(3);
        // Now its descending order
        System.out.println(set2);


        // Use of Lambda Expression to store Objects in Ascending orderd (id)
        TreeSet<Student> students1 = new TreeSet<>((a, b) -> a.id - b.id);
        students1.add(new Student("Ram", 1));
        students1.add(new Student("Sham", 3));
        students1.add(new Student("Vina", 2));
        students1.add(new Student("Harry", 5));
        System.out.println(students1);

        // Use of Lambda Expression to store Objects in Descending orderd (id)
        TreeSet<Student> students2 = new TreeSet<>((a, b) -> b.id - a.id);
        students2.add(new Student("Karan", 4));
        students2.add(new Student("Vishal", 10));
        students2.add(new Student("Rohit", 6));
        students2.add(new Student("Pratik", 8));
        System.out.println(students2);

    }
}

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return name + "(" + id + ")";
    }
}
