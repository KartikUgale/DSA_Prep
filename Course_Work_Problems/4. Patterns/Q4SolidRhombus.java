import java.util.Scanner;

public class Q4SolidRhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int time = 1;
        while (time <= 5) {
            for (int i = 1; i <= num; i++) {
                StarPattern(i, num);
            }
            for (int i = num-1; i >= 1; i--) {
                StarPattern(i, num);
            } time++;
        }

        sc.close();
    }

    public static void StarPattern(int i, int num) {
        for (int k = 1; k <= i; k++) {
            System.out.print("  ");
        }
        System.out.print("* * * * *");
        System.out.println();
    }
}
