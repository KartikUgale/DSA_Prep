public class OOPs { // (Note)-Always start class / file name from Capital letter
    public static void main(String[] args) {
        Pen p1 = new Pen(); // pen() is a constructor. "new" Keyword creates a memory location in heap
                            // memory

        p1.setColor("Blue");
        System.out.println(p1.color);

        p1.setThickness(2);
        System.out.println(p1.tip + " mm");

        p1.color = "Red";
        System.out.println(p1.color);

        Student s1 = new Student();
        s1.setName("Kartik Ugale");
        System.out.println(s1.name);

        s1.setAge(21);
        System.out.println(s1.age);

        s1.calPercentage(99, 95, 98);
        System.out.println(s1.percentage);
    }
}

class Pen { // class 1
    String color; // property 1
    int tip; // property 2

    void setColor(String newColor) { // function 1
        color = newColor;
    }

    void setThickness(int newTip) { // function 2
        tip = newTip;
    }
}

class Student { // 2nd class
    String name; // property 1
    int age; // property 2
    float percentage;

    void setName(String newName) { // function 1
        name = newName;
    }

    void setAge(int newAge) { // function 2
        age = newAge;
    }

    void calPercentage(float math, float scince, float english) {
        percentage = (math + scince + english) / 3;
    }
}