import javax.sql.rowset.spi.SyncResolver;

public class Method {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }

    Animal() {
        System.out.println("Animal class called");
    }
}

class Dog extends Animal {

    Dog() {
        // super();
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void show() {
        sound();
        super.sound();
    }

    
}
