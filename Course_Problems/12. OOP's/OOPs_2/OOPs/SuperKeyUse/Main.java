package OOPs.SuperKeyUse;

public class Main {
    static {
        System.out.println("Static-1 block run");
    }

    public static void main(String[] args) {
        Car c1 = new Car("toyota", "SUV");
        c1.showDetails();

    }

    static {
        System.out.println("Static-2 block run");
    }

}
