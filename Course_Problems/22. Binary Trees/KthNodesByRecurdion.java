public class KthNodesByRecurdion {
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

    public static void k_thNodes(Node root, int k) {
        print_KthNodes(root, k, 0);
    }

    public static void print_KthNodes(Node root, int k, int count) {
        if (root == null) {
            return;
        }

        if (count == k) {
            System.out.print(root.data + " ");
        }

        print_KthNodes(root.left, k, count + 1);
        print_KthNodes(root.right, k, count + 1);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        k_thNodes(root, 2);
    }
}
