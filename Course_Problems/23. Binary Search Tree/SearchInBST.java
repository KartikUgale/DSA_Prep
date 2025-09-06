public class SearchInBST {
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

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        } else if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
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

        System.out.println(search(root, 4));
    }
}
