import java.util.ArrayList;

public class makeBSTbalanced {
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

    public static Node balancedBST(Node root) {
        ArrayList<Integer> path = new ArrayList<>();
        addInorderPath(root, path);
        root = covert2BalancedBST(path, 0, path.size() - 1);
        return root;
    }

    public static void addInorderPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        addInorderPath(root.left, path);
        path.add(root.data);
        addInorderPath(root.right, path);
    }

    public static Node covert2BalancedBST(ArrayList<Integer> path, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(path.get(mid));
        root.left = covert2BalancedBST(path, start, mid - 1);
        root.right = covert2BalancedBST(path, mid + 1, end);

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
         * 8
         * / \
         * 6 10
         * / \
         * 5 11
         * / \
         * 3 12
         */
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        /*
         * Expected balanced BST
         * 8
         * / \
         * 5 11
         * / \ / \
         * 3 6 10 12
         */

        preorder(root);
        System.out.println();

        root = balancedBST(root);
        preorder(root);
    }
}
