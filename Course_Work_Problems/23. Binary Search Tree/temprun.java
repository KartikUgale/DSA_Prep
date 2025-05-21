public class temprun {
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

    public static Node buildBST(Node root, int val) { // build Binary Search Tree
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

    public static void inorder(Node root) { // Print Tree inorder Traversal
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static Node delete(Node root, int val) { // delete
        if (root.data > val) {
            delete(root.left, val);
        } else if (root.data < val) {
            delete(root.right, val);
        } else {
            // case 1 - Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - single child Node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - both children Node
            Node IS = findInorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] values = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int currVal : values) {
            root = buildBST(root, currVal);
        }
        inorder(root);

        System.out.println();

        delete(root, 5);
        inorder(root);
    }
}
