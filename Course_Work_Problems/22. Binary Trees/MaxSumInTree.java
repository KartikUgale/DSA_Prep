public class MaxSumInTree {
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

    static int maxSum = Integer.MIN_VALUE;

    public static int maxSum(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = maxSum(root.left);
        int rightSum = maxSum(root.right);

        maxSum = Math.max(maxSum, root.data + leftSum + rightSum);
        return root.data + Math.max(leftSum, rightSum);
    }

    public static int maxSumFind(Node root) {
        maxSum = Integer.MIN_VALUE;
        maxSum(root);
        return maxSum;
    }

    public static void main(String[] args) {
        /*
         * -10
         * / \
         * 9 20
         * / \
         * 15 7
         */
        Node root = new Node(-10);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(maxSumFind(root)); // Expected ans = 42
    }
}
