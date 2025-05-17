import java.util.Scanner;

public class ContinueQ1 {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        
        while(true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            
            if((num%10) == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}