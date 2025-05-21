public class Polymorphism { // types of polymorphism
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 4));
        System.out.println(calc.sum(2, 4, 2));
        System.out.println(calc.sum((float) 2.3, (float) 8.5));

        Deer d1 = new Deer();
        d1.eat();
    }
}

// Method Overloading
class Calculator { // Same name functions(sum) but type(int,float, number of type) is different
    int sum(int a, int b) { // same function name = "sum" but type int 2 times.
        return a + b;
    }

    int sum(int a, int b, int c) { // same function name = "sum" but type 3 times int
        return a + b + c;
    }

    float sum(float a, float b) { // same function name = "sum" but type is float 2 times
        return a + b;
    }
}

// Method Overriding
class Animal { // same function in parent and child Class with different definition/work.
    void eat() {
        System.out.println("Eat");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eat Grass");
    }
}