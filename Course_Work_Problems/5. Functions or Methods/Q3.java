//  Write a Java program to check if a number is a palindrome in Java?
// (121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number 
// e.g., 121 is apalindrome because there verse of 121 is 121 it self. 
// On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

import java.util.*;

public class Q3 {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        while (true) {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();
            printStatus(num);
        }
    }

    public static boolean palindrome(int n) {
        int givenNum = n;
        int pow = -1, newNum = 0;

        while (n>0) {
            pow++;
            n/=10;
        }
        n = givenNum;
        while (n>0) {
            int LastDig = n % 10;
            newNum = newNum + (LastDig * (int)Math.pow(10,pow));
            n/=10;
            pow--;
        }
        if (givenNum == newNum) return true;
        else return false;
    }

    public static void printStatus(int number) {
        if (palindrome(number)) {
            System.out.println("is Palindrome Number");
        } else {
            System.out.println("is Not Palindrome");
        }
    }
}