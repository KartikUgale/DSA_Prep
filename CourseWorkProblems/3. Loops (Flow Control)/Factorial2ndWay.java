import java.util.Scanner;

public class Factorial2ndWay {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int fact = 1;
        if(num>=0){
            for (int i=1; i<=num; i++) {
                fact*=i;
            }
            System.out.println(num+"! = "+fact);
        } else {
            System.out.println("Enter +ve Numbers Only");
        }

        sc.close();
    }
}
