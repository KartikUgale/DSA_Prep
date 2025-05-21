import java.util.Scanner;

public class breakQue {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        
        // while(true){
        //     int num = sc.nextInt();
        //     if((num%10) == 0){
        //         System.out.println("Divisable by 10");
        //         break;
        //     }
        //     System.out.println(num);
        // }

        do{
            int n = sc.nextInt();
            if (n%10 == 0) {
                break;
            }
            System.out.println(n);
        } while(true);
        
        sc.close();
    }
}