import java.util.Scanner;

public class diamond_WithMethods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter req. Stars in middle row of Diamond: ");
        int stars = sc.nextInt();

        if (stars % 2 == 0) {
            int num = stars / 2;
            for (int i = 1; i <= num; i++) {
                DiamondPattern(i,num);
            }
            for (int i = num; i >= 1; i--) {
                DiamondPattern(i, num);
            }
        } else {
            int num = (stars+1)/2;
            for (int i=1; i<=num; i++) {
                OddPattern(i, num);
            }
            for (int i = num-1; i >= 1; i--) {
                OddPattern(i,num);
            }
        }
        System.out.println(stars+" x "+stars);
        sc.close();
    }

    public static void DiamondPattern(int i, int num) {
        for (int j = 1; j <= num - i; j++) {
            System.out.print("  ");
        }
        for (int k = 1; k <= (i + i); k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
    
    public static void OddPattern(int i, int num){
        for (int j = 1; j <= num - i; j++) {
            System.out.print("  ");
        }
        for (int k = 1; k <= (i + i)-1; k++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
