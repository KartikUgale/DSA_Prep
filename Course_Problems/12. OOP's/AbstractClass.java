public class AbstractClass { // (Abstraction) 4th piller of OOPs
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color); // parent contructor always called before child
        // System.out.println(h1.changeColor);

        Hen p1 = new Hen();
        p1.eat();
        p1.walk();

        // Animal a = new Animal(); we can not make object of this abstract class in
        // main method
    }
}

abstract class Animal { // we can not make object of this abstract class in main method
    String color;

    void eat() { // non-abstract function
        System.out.println("Animal Eats");
    }

    Animal() {
        color = "brown";
    }

    abstract void walk(); // abstract function is gives only idea. e.g.- Animals are Walk but how is not
                          // explained by its Animal class.
                          // walk function is mandatory to used in child classes (Horse & Hen).
}

class Horse extends Animal {
    void walk() {
        System.out.println("Walk on 4 legs");
    }

    void changeColor() {
        color = "white";
    }
}

class Hen extends Animal {
    void walk() {
        System.out.println("Walks on 2 legs");
    }

    void changeColor() {
        color = "yellow";
    }
}