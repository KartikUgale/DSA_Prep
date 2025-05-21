import java.util.Scanner;

public class areaOfCircle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        Float Area = 3.14f * radius * radius;
        System.out.println("Area of circle = " + Area);
    }
}