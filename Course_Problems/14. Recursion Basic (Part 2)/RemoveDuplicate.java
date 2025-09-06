public class RemoveDuplicate {
    public static void removeDuplicateChar(String str, int idx, StringBuilder newStr, boolean visited[]) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(idx);
        if (visited[currChar - 'a'] == true) {
            // Duplicate
            removeDuplicateChar(str, idx + 1, newStr, visited);
        } else {
            visited[currChar - 'a'] = true;
            removeDuplicateChar(str, idx + 1, newStr.append(currChar), visited);
        }
    }

    public static void main(String[] args) {
        String str = "aabbbdddcshgjhhhh";
        removeDuplicateChar(str, 0, new StringBuilder(""), new boolean[26]);
    }
}