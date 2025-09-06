public class Single_level_Inheritence { // 1st Type of Inheritance
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.move();
        shark.swim();
        shark.fins();
    }
}

// Parent or based class
class Animals {
    String color;

    void eat() {
        System.out.println("Eat");
    }

    void move() {
        System.out.println("Move");
    }
}

// subclass or child class or derived class
class Fish extends Animals {
    void swim() {
        System.out.println("fish can swim");
    }

    void fins() {
        System.out.println("fish have fins");
    }
}