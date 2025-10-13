public class Inheritance1 {
    public static void main(String[] args) {
        Car c1 = new Ferrari();
        c1.setColor("Red");
        // c1.validity = 90;    using Parrent class (Car) we cannot achive Child class (Ferrari) pa


        Ferrari la = new Ferrari();
        la.setSpeed(200);
        System.out.println(la.getSpeed());
        la.validity = 8;
    }
}

abstract class Car {
    private int speed;
    private String color;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

class Ferrari extends Car {
    int validity;

    public String getColor() {
        return super.getColor();
    }

    public void setColor(String color) {
        super.setColor(color);
    }
}