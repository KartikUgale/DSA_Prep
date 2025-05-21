import java.util.Arrays;

public class UniquePrefix {
    static class Node {
        Node[] children = new Node[26];
        int freq;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    // Method to insert a word into the Trie
    public static void insert(String str) {
        Node curr = root;
        for (char ch : str.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            } else {
                curr.children[index].freq++;
            }
            curr = curr.children[index];
        }
    }

    // Method to find the shortest unique prefix for each word
    public static String findPrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            prefix.append(ch);

            // If frequency is 1, the prefix is unique
            if (curr.children[index].freq == 1) {
                break;
            }
            curr = curr.children[index];
        }

        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] words = { "zebra", "dog", "duck", "dove" };
        for (String str : words) {
            insert(str);
        }

        // Find the shortest unique prefix for each word
        String[] result = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            result[i] = findPrefix(words[i]);
        }

        System.out.println("Shortest unique prefixes: " + Arrays.toString(result));
    }
}
