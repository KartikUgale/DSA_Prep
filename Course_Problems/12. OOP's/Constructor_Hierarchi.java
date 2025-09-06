public class Constructor_Hierarchi {
    public static void main(String[] args) {
        Mustang m = new Mustang();
        // Hierarchi = Animal class -> Horse class -> Mustang class
        // Animal class inherite Horse class.
        // Horse class inherite mustang class.

    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal constructor called");
    }
}

class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor called");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang constructor called");
    }
}
