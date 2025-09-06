public class Copy_Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Kartik ugale";
        s1.rollNo = 12;
        s1.id = "Kartik12345";
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 97;

        Student s2 = new Student(s1); // Copy data from s1 to s2
        s2.id = "Kar@911";

        s1.marks[2] = 100; // s1 च्या Array मध्ये नंतर केलेले changes सुद्धा s2 च्या Array मध्ये reflect
                           // होतात.
                           // (because Array creates in Momory, outSide of both s1 & s2.
                           // only Array's memory location reference stores in s1 & s2. for this reson when
                           // array's data change in s1 it will reflect in s2.

        System.out.println("Name:- " + s1.name);
        System.out.println("Roll No.:-" + s1.rollNo);
        System.out.println("s1.ID:-" + s1.id);
        for (int i = 0; i < s1.marks.length; i++) {
            System.out.println(s1.marks[i]);
        }

        System.out.println("\nName:- " + s2.name);
        System.out.println("Roll No.:-" + s2.rollNo);
        System.out.println("s2.ID:-" + s2.id);
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String id;
    int[] marks;

    // Default Constuctor
    Student() {
        this.marks = new int[3];
    }

    // Shallow Copy constructor
    // Student(Student s1){
    // this.name = s1.name;
    // this.rollNo = s1.rollNo;
    // this.marks = s1.marks;
    // }

    // Deep Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = new int[s1.marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

}
