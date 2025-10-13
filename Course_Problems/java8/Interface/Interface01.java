public class Interface01 implements MathFun {
    public void sum() {
        System.out.println("math function");
    }
    public static void main(String[] args) {
        Interface01 m1 = new Interface01();
        m1.div();
        m1.rem(10, 1);

        MathFun.sub();  // no need of object creation or implementation for static function 
    }
}

@FunctionalInterface
interface MathFun {
    void sum();

    // void rem();  // only one abstract method is allowed in Finctional Interface

    // static, defalut & private concrete functions allowed in functional interface
    static void sub() {  
        System.out.println("substraction");
    }

    default void div() {
        System.out.println("division");
    }

    private static int reminder(int a, int b) {
        return a + b;
    }

    default void rem(int a, int b) {
        System.out.println(reminder(a, b));
    }
}
