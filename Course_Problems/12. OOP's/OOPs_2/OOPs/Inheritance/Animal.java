package OOPs.Inheritance;

public class Animal {
    String name;

    void eat() {
        System.out.println(name+ " is eat");
    }

    void sleep() {
        System.out.println(name+" is sleep");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println(name + " is bark");
    }

    void isPet() {
        System.out.println(name + " is Pet");
    }
}
