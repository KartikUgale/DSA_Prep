public class MirrorNode {
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

    public static Node mirror(Node root) {
        if (root == null) {
            return null;
        }

        Node left = mirror(root.left);
        Node right = mirror(root.right);

        root.left = right;
        root.right = left;

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

        inorder(root);
        System.out.println();

        mirror(root);
        inorder(root);
    }
}
