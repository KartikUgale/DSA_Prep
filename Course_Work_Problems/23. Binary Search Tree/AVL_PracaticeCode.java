public class AVL_PracaticeCode {
    static class Node {
        int data, height;
        Node left, right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return root.height;
    }

    public static int getBalance(Node root) {
        if (root == null) {
            return 0;
        }
        return height(root.left) - height(root.right);
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // rotation perform
        y.left = x;
        x.right = T2;

        // update heights
        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // rotaion perform
        x.right = y;
        y.left = T2;

        // update heights
        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data)
            root.left = insert(root.left, key);
        else if (key > root.data)
            root.right = insert(root.right, key);
        else
            return root;

        // update root height
        root.height = Math.max(height(root.left), height(root.right)) + 1;

        // get root balance factor
        int bf = getBalance(root);

        // LL case
        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        // RR case
        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        // LR case
        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        // RL case
        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
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
        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        /*
         * AVL Tree
         * 30
         * / \
         * 20 40
         * / \ \
         * 10 25 50
         */

        inorder(root);
    }
}