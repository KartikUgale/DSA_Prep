// Thread using lambda expression

public class _02ThreadWithLambda {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " Thread 1");
            }
        };

        Thread th1 = new Thread(r1);
        th1.start();

        Thread th2 = new Thread(r1);
        th2.start();
        

        // another direct way
        new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " Thread 2");
            }
        }).start();

    }
}