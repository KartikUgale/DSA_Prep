package OOPs;// Object Class --> Class (parent or parent + child --> object

public class ObjectClassCode {
    public static void main(String[] args){
        Car car1 = new Car("Toyota", "SUV");
        System.out.println(car1.toString());
        System.out.println(car1);
        System.out.println(car1.hashCode());

        Car car2 = new Car("Toyota", "SUV");
        System.out.println(car2);
        System.out.println(car2.hashCode());

    }
}

class Car {
    String model, type;

    public Car(String model, String type) {
        this.model = model;
        this.type = type;
    }

//    @Override
//    public String toString() {
//        return "OOPs.Car Model = " + model + ", OOPs.Car Type = " + type;
//    }


    @Override
    public int hashCode() {
        int initialNumber = 31;
        initialNumber += model.hashCode();
        return initialNumber += type.hashCode();
    }

}