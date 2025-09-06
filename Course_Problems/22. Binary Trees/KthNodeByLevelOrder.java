import java.util.Queue;
import java.util.LinkedList;

public class KthNodeByLevelOrder { // Approach 1 --> solved using level order (2nd approach --> using recursion)
    static class Node {
        int data;
        Node right;
        Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    public static void k_thNode(Node root, int level) {
        if (root == null) {
            return;
        }

        int count = 0;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    System.out.println();
                } else {
                    q.add(null);
                    count++;
                }
            } else {
                if (count == level) {
                    System.out.print(curr.data + " ");
                }
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        /*
         * 1 ---level 0
         * / \
         * 2 3 ---level 1
         * / \ / \
         * 4 5 6 7 ---level 2
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int level = 0;
        k_thNode(root, level);
    }
}
