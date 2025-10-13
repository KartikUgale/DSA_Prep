public class CustomFunctionalInterface {
    public static void main(String[] args) {
        sumOf sum = (a, b) -> System.out.println(a + b);

        sum.printSum(10, 20);
    }
}

@FunctionalInterface
interface sumOf {
    void printSum(int a, int b);
}