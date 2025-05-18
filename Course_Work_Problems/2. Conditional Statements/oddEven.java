import java.util.*;

public class oddEven{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number");
        int Number = sc.nextInt();

        if((Number%2)==0)
        System.out.println(Number+" is Even");
        else
        System.out.println(Number+ " is Odd");

        sc.close();
    }
}