import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // How to creat array
        int numbers[] = new int[50];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[4] = 40;
        numbers[20] = 100;

        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(Arrays.toString(numbers));

        int marks[] = { 90, 92, 98, 96 };

        char ch[] = { 'a', 'b', 'c' };

        String fruits[] = { "Apple", "Mango", "orange" };

        System.out.println(Arrays.toString(marks)); // print by converting in String

        for (int mark : marks) { // Print Using loop
            System.out.print(mark + " ");
        }
    }
}