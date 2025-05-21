public class isMirrorTree {
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

    public static boolean isMirrorOfMainTree_1(Node root1, Node root2) { // Approach 1
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        if (root1.left != null && root2.right != null && root1.left.data != root2.right.data) {
            return false;
        }
        if (root1.right != null && root2.left != null && root1.right.data != root2.left.data) {
            return false;
        }
        return isMirrorOfMainTree_1(root1.left, root2.right) && isMirrorOfMainTree_1(root1.right, root2.left);
    }

    public static boolean isMirrorOfMainTree_2(Node root1, Node root2) {
        if (root1 == null && root2 == null) {
            return true;
        }
        if (root1 == null || root2 == null) {
            return false;
        }

        return (root1.data == root2.data) &&
                isMirrorOfMainTree_2(root1.left, root2.right) &&
                isMirrorOfMainTree_2(root1.right, root2.left);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        /*
         * 1
         * / \
         * 3 2
         * / \ / \
         * 7 6 5 4
         */
        Node root2 = new Node(1);
        root2.left = new Node(3);
        root2.right = new Node(2);
        root2.left.left = new Node(7);
        root2.left.right = new Node(6);
        root2.right.left = new Node(5);
        root2.right.right = new Node(4);

        System.out.println(isMirrorOfMainTree_1(root1, root2)); // Approach 1
        System.out.println(isMirrorOfMainTree_2(root1, root2)); // Approach 2
    }
}
