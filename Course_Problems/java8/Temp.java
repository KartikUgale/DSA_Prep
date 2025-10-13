public class Temp {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 11; i++) {
                System.out.print(i + " ");
            }
        };

        Thread th1 = new Thread(r1);
        th1.start();

        Thread th2 = new Thread(r1);
        th2.start();
    }
}