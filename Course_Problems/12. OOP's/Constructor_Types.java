public class Constructor_Types {
    public static void main(String[] args) {
        Student s1 = new Student(); // Type 1. Non-parameterized Constuctor
        Student s2 = new Student("Kartik Ugale"); // Type 2. Parameterized Constructor
        Student s3 = new Student(12); // Type 3. Parameterized Constructor

    }
}

class Student {
    String name;
    int number;

    Student() {
        System.out.println("Welcome");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int number) {
        this.number = number;
    }

}
// Constructor Overloading:-
// जेव्हा आपण Constructor बनवतो आणि तो constructor automatically त्याच्या class
// मधून त्याच्या related function ला call करतो या fenomenon ला "Constructor
// Overloading" म्हणतात.
// e.g.- "new Student()" call function "Student()" Automatically.
// "new Student("Kartik Ugale")" call function "Student(String name)"
// Aytomatically.
// "new Student(12)" call function "Student(int number)" Automatically.

// there are three types of Constructors:-
// 1. Non-Parameterized constructor
// 2. Parameterized constructor
// 3. Copy constructor