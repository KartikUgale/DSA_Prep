public class RuntimePolymorphism1 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.drive();

        Car c2 = new Ferrari(); 
        c2.drive();
        
        Ferrari f1 = new Ferrari();
        f1.drive();
        f1.turbo();
    }
}

class Car {
    public void drive() {
        System.out.println("driving car");
    }
}

class Ferrari extends Car {
    public void drive() {
        System.out.println("driving ferrari");
    }

    public void turbo() {
        System.out.println("driving while turbo on");
    }
}
