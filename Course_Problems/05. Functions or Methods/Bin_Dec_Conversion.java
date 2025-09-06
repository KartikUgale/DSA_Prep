import java.util.Scanner;

public class Bin_Dec_Conversion {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.println(dec_ToBin(num));
        sc.close();
    }

    public static int BinToDec(int num) {
        int pow = 0, decNum = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow++));
            num = num / 10;
        }
        return decNum;
    }

    public static String decToBin(int num) {
        StringBuffer sb = new StringBuffer();
        while (num > 0) {
            sb.append((int) (num % 2));
            num /= 2;
        }
        return (sb.reverse()).toString();
    }

    public static int dec_ToBin(int num) {
        int pow = 0, BinNum = 0;
        while (num > 0) {
            int rem = num % 2;
            BinNum = BinNum + (rem * (int) Math.pow(10, pow));
            System.out.print(rem * (int) Math.pow(10, pow) + " ");
            pow++;
            num /= 2;
        }
        System.out.println();
        return BinNum;
    }
}