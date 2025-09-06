import java.util.Arrays;

public class Anagrams {
    public static Boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            return Arrays.equals(str1charArray, str2charArray);
        }
        return false;
    }

    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";
        if (isAnagram(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
