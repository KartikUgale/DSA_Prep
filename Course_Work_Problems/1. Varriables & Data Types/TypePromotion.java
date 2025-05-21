//  There are Two types of Type Casting.
/* 1. Java Automatically promots each byte, short, or char 
 *    operand to int when evaluting an expression.
 * 2. If one operand is long, float or double the whole expression 
 *    is promoted to long, float, or double respectively.
*/

public class TypePromotion {
    public static void main(String args[]) {
        // (Type 1) char,short,byte --> int
        char a = 3;
        char b = 5;
        int c = a + b; // Converted char to int
        System.out.println(c);

        // (Type 2) long, float, double --> long, float, double (Respectively)
        float f1 = 17.4F;
        float f2 = 56.2F;
        double D = f1 + f2; // converted float to double
        System.out.println(D);

        // NOTE:- When we use 'byte' in expressions (+*-/) then java always promote it
        // into 'int'
        byte b1 = 2;
        byte b2 = 3;
        // byte b3 = b1 + b2; Gives error
        int b3 = b1 + b2;
        System.out.println(b3);
        byte b4 = (byte) (b1 + b2); // typecast is required to store expression value in byte
        System.out.println(b4);
    }
}