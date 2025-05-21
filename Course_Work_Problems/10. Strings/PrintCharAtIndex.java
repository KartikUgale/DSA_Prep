public class PrintCharAtIndex {
    public static void printChar(String ch) {
        for (int i = 0; i < ch.length(); i++) {
            System.out.print(ch.charAt(i));
        }
    }

    public static void main(String[] args) {
        String name = "Kartik Ugale";
        printChar(name);
    }
}
