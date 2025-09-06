public class LargestWord { // code not working
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
        }
        curr.eow = true;
    }

    public static String ans = "";

    public static void largestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                temp.append(ch);

                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                largestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = { "a", "app", "apple", "banana", "apply" };

        for (String word : words) {
            insert(word);
        }

        largestWord(root, new StringBuilder(""));

        System.out.println(ans);
    }
}
