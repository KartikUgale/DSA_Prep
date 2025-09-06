import java.util.ArrayList;

public class RootToLeafPath {
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

    static int pathNo = 1;

    public static void root2path(Node root) {
        pathNo = 1;
        ArrayList<Integer> path = new ArrayList<>();
        printPath(root, path);
    }

    public static void printPath(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }
        path.add(root.data);
        if (root.left == null && root.right == null) {
            print(path);
        }
        printPath(root.left, path);
        printPath(root.right, path);
        path.remove(path.size() - 1);
    }

    public static void print(ArrayList<Integer> path) {
        System.out.print("Path " + pathNo + " = ");
        pathNo++;
        for (int node : path) {
            System.out.print(node + "-->");
        }
        System.out.println("Null");
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

        root2path(root);
    }
}