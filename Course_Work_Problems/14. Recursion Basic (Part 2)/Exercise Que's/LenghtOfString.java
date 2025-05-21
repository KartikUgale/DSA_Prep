public class LenghtOfString {
    public static int lengthOfString(String str) {
        System.out.println(str.length());
        if (str.length() == 1) {
            return 1;
        }
        return lengthOfString(str.substring(1)) + 1;

    }

    public static void main(String[] args) {
        String str = "Kartik";
        System.out.println(lengthOfString(str));
    }
}
