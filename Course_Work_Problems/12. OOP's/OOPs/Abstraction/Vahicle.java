package OOPs.Abstraction;

abstract class Vehicle {
    String brand;
    String color;

    abstract void color();

    public void displayBrand() {
        System.out.println(brand);
    }

    public Vehicle() {}

    public Vehicle(String brandName) {
        this.brand = brandName;
    }
}

class Car extends Vehicle {
    String type;
    String color;

    void setType(String type) {
        this.type = type;
    }

    @Override
    void color() {
        this.color = "White";
    }

    public Car(String brand) {
        super(brand);
        System.out.println("car create");
    }

    public Car() {}
}