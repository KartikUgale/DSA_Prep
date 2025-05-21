// Simple Bill

import java.util.*;

public class Q3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prices \nPencil = ");
        float Pencil = sc.nextFloat();

        System.out.print("Pen = ");
        float Pen = sc.nextFloat();

        System.out.print("Eraser = ");
        float Eraser = sc.nextFloat();
        System.out.println();

        System.out.println("-----Your Bill-----");
        System.out.println("Pencil : " + Pencil);
        System.out.println("Pen : " + Pen);
        System.out.println("Eraser : " + Eraser);

        Float Total = Pencil + Pen + Eraser;
        System.out.println("\n Total : " + Total);

        sc.close();
    }
}