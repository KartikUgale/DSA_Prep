public class ConcreatInInterface {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.eat();
        c1.breath();

        Cat d1 = new Dog();
        d1.eat();
    }
}

interface Animal {
    void eat();

    // after java 8 version java start supports to "static" and "default" non-abstract (concrete) methods in Interfaces
    public static void voice() {
        System.out.println("animal makes sound");
    }

    default void breath() {
        System.out.println("animal breath");
    }

    private void java9Feature() {
        System.out.println("from java 9, private methods allowed in interface");
    }
}

class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("drink milk");
    }
}

class Dog extends Cat {
    @Override
    public void eat() {
        System.out.println("eat meat");
    }
}
