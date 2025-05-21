public class TypeConversion {
    public static void main(String args[]) {
        // byte -> short -> float -> long -> double
        // java only allow to convert small data into large data automatically

        int a = 56;
        long b = a;
        System.out.println(b); // long

        int i = 6;
        float f = i;
        System.out.println(f); // float
    }
}