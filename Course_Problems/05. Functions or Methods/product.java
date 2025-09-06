import java.util.Scanner;

public class product {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(ProductofNum(a, b));
    }

    public static int ProductofNum(int num1, int num2) {
        int Product = num1 * num2;
        return Product;
    }
}
