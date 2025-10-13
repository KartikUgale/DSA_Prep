public class DeleteItCode {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
}

interface I1 {
    default void show() {
        System.out.println("I1 called");
    }
}

interface I2 {
    default void show() {
        System.out.println("I2 called");
    }
}

class A implements I1, I2 {
    public void show() {
        I1.super.show();
        I2.super.show();
    }
}