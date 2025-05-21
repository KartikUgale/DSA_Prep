import java.util.*; // <---- utility is a inbuilt package which is in java.

public class InbuiltPackage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // "Scanner" is a class, "sc" is object, "new" is a Keyword.
                                             // then "Scanner()" is constructor which create space in memory.
                                             // (System.in) is a parameter.
        int a = sc.nextInt(); // nextInt() is use to call a function.

        System.out.println(a);
    }
}

// class Scanner{ // This types of class we maked before.
// void nextInt(){

// }
// }