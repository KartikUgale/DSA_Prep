public class SuperKeyForVariable {
    public static void main(String[] args) {
        num1 n1 = new num1();
        System.out.println(n1.getNumber());
    }
}

class Num {
    int number = 100;
}

class num1 extends Num {
    int number = 200;

    public int getNumber() {
        System.out.println("Child class Num : "+number + ", SuperClass Num : "+super.number);
        return super.number;
    }
}
