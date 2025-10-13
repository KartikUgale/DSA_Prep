package OOPs.SuperKeyUse;

public class Vehicle {
    String brand;
    String color;

    public Vehicle() {}

    public Vehicle(String brand) {
        this.brand = brand;
        System.out.println("Vehicle class Called");
    }
}

class Car extends Vehicle {
    String type;

    public Car(String brand, String type) {
        super(brand);
        this.type = type;
    }

    public void showDetails() {
        System.out.println("Car Type : "+type +", Car Brand : "+brand);
    }
}