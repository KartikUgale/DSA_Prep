import java.util.*;
public class ternaryoperater{
    public static void main (String arge[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Marks");
        int Marks = sc.nextInt();

        String A = ((Marks%2)==0)? "EVEN Marks" : "ODD Marks";
        System.out.println(A);

        String report = Marks <= 25 ? "Fail" : "Pass";
        System.out.println(report);
    }
}