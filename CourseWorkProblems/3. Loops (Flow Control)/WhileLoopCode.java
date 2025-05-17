import java.util.Scanner;

public class WhileLoopCode{
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter Name");
        String name = sc.nextLine();

        int i=1;
        while (i<=10) {
            System.out.println(i +" - "+ name);
            i++;
        }
        sc.close();
    }
}