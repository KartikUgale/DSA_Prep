public class Hybrid_Inheritance { // 4th Type hybrid Enheritance
    public static void main(String[] args) {
        Dog bimmer = new Dog();
        bimmer.legs();
        bimmer.eat();
        bimmer.whatEat();

        Cat thamya = new Cat();
        thamya.eat();
        thamya.whatEat();

        Hen piny = new Hen();
        piny.eat();
        piny.whatEat();
        piny.legs();
    }
}

class Animals {
    void eat() {
        System.out.println("Eats");
    }

    void breath() {
        System.out.println("Breath");
    }
}

class Mammals extends Animals {
    void move() {
        System.out.println("Walks");
    }
}

class Birds extends Animals {
    void move() {
        System.out.println("Fly");
    }
}

class Dog extends Mammals {
    void legs() {
        System.out.println("Have 4 Legs");
    }

    void whatEat() {
        System.out.println("Eat Both Veg & Non-Veg");
    }
}

class Hen extends Birds {
    void legs() {
        System.out.println("Have a 2 Legs");
    }

    void whatEat() {
        System.out.println("Incects & seeds");
    }
}

class Cat extends Mammals {
    void legs() {
        System.out.println("4 legs");
    }

    void whatEat() {
        System.out.println("Love to eat Milk");
    }
}