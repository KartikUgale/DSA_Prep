import java.util.ArrayList;

public class ValidateBST { // VVIMP Quetion (asked by Snapdeal, flipkart, amazon) // Approach 1 (brute force)
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    public static boolean isValidBST(Node root) {
        ArrayList<Integer> list = new ArrayList<>();
        storeInorder(root, list);
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void storeInorder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        storeInorder(root.left, list);
        list.add(root.data);
        storeInorder(root.right, list);
    }

    public static void main(String[] args) {
        /*
         * 8
         * / \
         * 5 10
         * / \ \
         * 3 6 11
         * / \
         * 1 14
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.left.left.left = new Node(1);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        System.out.println(isValidBST(root));
    }
}