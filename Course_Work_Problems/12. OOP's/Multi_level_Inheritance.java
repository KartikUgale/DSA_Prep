public class Multi_level_Inheritance {// 2nd Type of Inheritance
    public static void main(String[] args) {
        Dog puppy = new Dog();
        puppy.eat();
        puppy.legs();
        puppy.breath();
        puppy.legs();
        puppy.color("White");
    }
}

class Animals {
    void breath() {
        System.out.println("It breath");
    }

    void color(String color) {
        System.out.println("Have a " + color + " color");
    }

    void eat() {
        System.out.println("eat");
    }
}

class Mammal extends Animals {
    void blood() {
        System.out.println("Mamals have a legs");
    }
}

class Dog extends Mammal {
    void legs() {
        System.out.println("Dogs have 4 legs");
    }
}
