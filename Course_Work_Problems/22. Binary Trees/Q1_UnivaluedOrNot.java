// Que- (Check if a Binary Tree is univalued or not).
//      We have a binary tree,the task is to check if the binary tree is univalued or not.If found to be true, then print “YES”. Otherwise, print “NO”.

public class Q1_UnivaluedOrNot {
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

    public static boolean isUnivalue(Node root) {
        if (root == null) {
            return true;
        }

        return isUnivalueHelper(root, root.data);
    }

    public static boolean isUnivalueHelper(Node root, int value) {
        if (root == null) {
            return true;
        }

        if (root.data != value) {
            return false;
        }

        return (isUnivalueHelper(root.left, value) && isUnivalueHelper(root.right, value));
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(2);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(9);
        root.right.left = new Node(2);
        root.right.right = new Node(2);

        if (isUnivalue(root)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
