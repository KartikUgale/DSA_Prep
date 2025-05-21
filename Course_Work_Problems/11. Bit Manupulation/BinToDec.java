import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number : ");
        String num = sc.next();
        binToDec(num);

        sc.close();
    }

    public static void binToDec(String binNum) {
        System.out.println(Integer.valueOf(binNum, 2));
    }
}