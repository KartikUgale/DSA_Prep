public class BuildBST {
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

    public static Node buildBST(Node root, int val) {
        if (root == null) {
            return root = new Node(val);
        }

        if (root.data > val) {
            root.left = buildBST(root.left, val);
        } else {
            root.right = buildBST(root.right, val);
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
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int currVal : values) {
            root = buildBST(root, currVal);
        }

        inorder(root);
    }
}