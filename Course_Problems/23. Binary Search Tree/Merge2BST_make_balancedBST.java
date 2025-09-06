import java.util.ArrayList;

public class Merge2BST_make_balancedBST {
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

    public static Node merge(Node root1, Node root2) {
        ArrayList<Integer> arr = new ArrayList<>();

        addBST(root1, arr);
        addBST(root2, arr);

        mergeSort(arr, 0, arr.size() - 1);

        return buildBalanceBST(arr, 0, arr.size() - 1);
    }

    public static void addBST(Node root, ArrayList<Integer> arr) { // add by inorder traversal
        if (root == null) {
            return;
        }

        addBST(root.left, arr);
        arr.add(root.data);
        addBST(root.right, arr);
    }

    public static void mergeSort(ArrayList<Integer> arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, end, mid);
    }

    public static void merge(ArrayList<Integer> arr, int start, int end, int mid) {
        int[] tempArr = new int[end - start + 1];
        int i_start = start;
        int j_start = mid + 1;
        int k = 0;

        while (i_start <= mid && j_start <= end) {
            if (arr.get(i_start) <= arr.get(j_start)) {
                tempArr[k++] = arr.get(i_start++);
            } else {
                tempArr[k++] = arr.get(j_start++);
            }
        }

        while (i_start <= mid) {
            tempArr[k++] = arr.get(i_start++);
        }

        while (j_start <= end) {
            tempArr[k++] = arr.get(j_start++);
        }

        for (int i = 0; i < tempArr.length; i++) {
            arr.set(start + i, tempArr[i]);
        }
    }

    public static Node buildBalanceBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = buildBalanceBST(arr, start, mid - 1); // left subtree
        root.right = buildBalanceBST(arr, mid + 1, end); // right subtree

        return root;
    }

    public static void preorder(Node root) { // print in preorder traversal
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        /*
         * 2
         * / \
         * 1 4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * 9
         * / \
         * 3 12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        /*
         * Expected BST
         * 3
         * / \
         * 1 9
         * \ / \
         * 2 4 12
         */
        Node root = merge(root1, root2);

        System.out.print("Preorder Traversal : ");
        preorder(root);

        System.out.println();

        System.out.print("Inorder Traversal : ");
        inorder(root);
    }
}