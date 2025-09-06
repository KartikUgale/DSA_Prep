public class FindSubsets {
    public static void subString(String str, String ans, int i) {
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // Yes Choice
        subString(str, ans + str.charAt(i), i + 1);
        // No choice
        subString(str, ans, i + 1);

    }

    public static void main(String[] args) {
        String str = "abc";
        subString(str, "", 0);
    }
}