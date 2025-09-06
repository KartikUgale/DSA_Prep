public class Q1_UnivaluedOrNot_2 { // approach 2
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

        if ((root.left != null && root.left.data != root.data)
                || (root.right != null && root.right.data != root.data)) {
            return false;
        }

        return isUnivalue(root.left) && isUnivalue(root.right);
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
        root.left.right = new Node(2);
        root.right.left = new Node(2);
        root.right.right = new Node(2);

        if (isUnivalue(root)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
