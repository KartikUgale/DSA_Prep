public class Hierarchial_Inheritance { // 3rd Type of Inheritance
    public static void main(String[] args) {
        Mammals dog = new Mammals();
        dog.color();
        dog.eat();
        dog.walk();

        Birds sparrow = new Birds();
        sparrow.eat();
        sparrow.fly();
        sparrow.color();

        Fish shark = new Fish();
        shark.swim();
        shark.color();
        shark.eat();
    }
}

class Animals {
    void color() {
        System.out.println("Have a Color");
    }

    void eat() {
        System.out.println("Eats");
    }
}

class Mammals extends Animals {
    Mammals() {
        System.out.println("------Mammals------");
    }

    void walk() {
        System.out.println("Walks");
    }
}

class Birds extends Animals {
    Birds() {
        System.out.println("------Birds------");
    }

    void fly() {
        System.out.println("Fly");
    }
}

class Fish extends Animals {
    Fish() {
        System.out.println("------Fish------");
    }

    void swim() {
        System.out.println("Swim");
    }
}
