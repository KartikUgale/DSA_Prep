public class MethodChaining {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle().setWheels(4).setType("car");
        v1.print();
    }
}

class Vehicle {
    private int wheels;
    private String type;

    public Vehicle setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public Vehicle setType(String type) {
        this.type = type;
        return this;
    }

    public void print() {
        System.out.println("Wheels : "+wheels+", Type : "+ type);
    }
}
