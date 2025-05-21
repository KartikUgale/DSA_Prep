public class Palindrome {
    public static boolean isPalindrome(String word) {
        int length = word.length() - 1;
        for (int i = 0; i <= length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i)) {
                return false;
            }
        }
        return true;
    }

    public static void printStatus(String word) {
        if (isPalindrome(word)) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is Not Palindrome");
        }
    }

    public static void main(String[] args) {
        String name = "racecar";
        printStatus(name);
    }
}
