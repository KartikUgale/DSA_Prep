public class _02NoLambda {
    public static void main(String[] args) {
        MyClass c1 = new MyClass();

        Thread t1 = new Thread(c1);
        t1.start();

        Thread t2 = new Thread(c1);
        t2.start();
    }
}

// "Runnable" is a inbuilt functional interface

class MyClass implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
    }
}
