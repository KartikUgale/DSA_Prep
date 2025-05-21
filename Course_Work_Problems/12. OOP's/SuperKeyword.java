public class SuperKeyword {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        System.out.println(doggy.color);

    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal Constructor called");
    }
}

class Dog extends Animal {
    Dog() {
        super.color = "black"; // super keyword used to called parent class. here "Animal constructor called" &
                               // "Dog costructor called"
        System.out.println("Dog constructor called"); // uses by default super keyword.
    }
}