public class delete_Leaf_Node {
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

    public static Node deleteLeaf(Node root, int val) {
        if (root == null) {
            return null;
        }

        root.left = deleteLeaf(root.left, val);
        root.right = deleteLeaf(root.right, val);

        if (root.left == null && root.right == null && root.data == val) {
            return null;
        }

        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 5
         * / \
         * 1 7
         * \
         * 3
         * / \
         * 2 4
         */
        Node root = new Node(5);
        root.left = new Node(1);
        root.right = new Node(7);
        root.left.right = new Node(3);
        root.left.right.left = new Node(2);
        root.left.right.right = new Node(4);

        root = deleteLeaf(root, 4);
        inorder(root);
    }
}
