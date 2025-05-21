public class NodeDiaApproach2 { // 2nd Approach of Node diameter
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

    static class info {
        int dia; // diameter
        int ht; // height

        info(int dia, int ht) {
            this.dia = dia;
            this.ht = ht;
        }
    }

    public static info diameter(Node root) { // O(n)
        if (root == null) {
            return new info(0, 0);
        }
        info leftInfo = diameter(root.left);
        info rightInfo = diameter(root.right);

        int dia = Math.max(Math.max(leftInfo.dia, rightInfo.dia), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

        return new info(dia, ht);
    }

    public static void main(String[] args) {
        /*
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * \
         * 8
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.right = new Node(8);

        System.out.println(diameter(root).dia);
    }
}
