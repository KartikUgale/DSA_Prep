public class Variable {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.type();
    }
}

class Animal {
    String type = "Animal";
}

class Dog extends Animal {
    String type = "Dog";

    void type() {
        System.out.println(type);
        System.out.println(super.type);
    }
}