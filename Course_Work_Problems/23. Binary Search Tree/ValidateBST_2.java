public class ValidateBST_2 { // VVIMP Quetion (asked by Snapdeal, flipkart, amazon) Approach 2 (check tree is BST or not)
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
        return isValid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static boolean isValid(Node root, long min, long max) {
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }
        return isValid(root.left, min, root.data) && isValid(root.right, root.data, max);
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
