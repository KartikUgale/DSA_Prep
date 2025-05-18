public class SwapInFunction {
    public static void main (String args[]){
        int a=2, b=3;
        System.out.println("a = "+a+", b = "+b);

        swap1(a, b);
        swap2(a,b);
    }

    public static void swap1(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("a = "+num1+", b = "+num2);
    }

    public static void swap2(int num1, int num2) {
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("a = "+num1+", b = "+num2);
    }
}