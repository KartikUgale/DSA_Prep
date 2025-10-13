public class SuperKeyForMethods {
    public static void main(String[] args) {
        Cow c1 = new Cow();
        c1.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("Animal eat's");
    }
}

class Cow extends Animal {
    public void eat() {
        super.eat();
        System.out.println("Cow eat grass");
    }
}