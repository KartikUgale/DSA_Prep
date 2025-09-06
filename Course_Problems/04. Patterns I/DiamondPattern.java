import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        // Create a scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Ask for number of rows (height of the diamond)
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Upper half of the diamond (including the middle line)
        for (int i = 1; i <= n; i++) {
            // Print spaces before stars
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before stars
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            // Move to the next line after each row
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
