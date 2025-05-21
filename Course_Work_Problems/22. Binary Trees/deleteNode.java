// Que = deleting all leaf nodes with a specific value x from a binary tree.

public class deleteNode {
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

    public static Node leafDelete(Node root, int x) {
        if (root == null) {
            return null;
        }

        root.left = leafDelete(root.left, x);
        root.right = leafDelete(root.right, x);

        if (root.left == null && root.right == null && root.data == x) {
            return null;
        }

        return root;
    }

    public static void preorder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");

        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * (4) 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root = leafDelete(root, 4);
        preorder(root);
    }
}
