import java.util.Scanner;

public class input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.println("Sum: " + SumOfNum(a, b)); // (a,b) is arguments or actual parameters (use during function call)
        sc.close();
    }

    public static int SumOfNum(int Num1, int Num2) { // (int Num1, int Num2) is Parameters or Formal Parameters (use during Funcion definition)
        int sum = Num1 + Num2;
        return sum;
    }
} 