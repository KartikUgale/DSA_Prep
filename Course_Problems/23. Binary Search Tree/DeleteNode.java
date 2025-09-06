public class DeleteNode {
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

    public static Node delete(Node root, int val) {
        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else {
            // case 1 - Leaf Node
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2 - Single Child Node
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3 - Both Children Node
            Node IS = findInorderSuccesor(root.right); // IS = Inorder Succesor
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccesor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
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
         * 8
         * / \
         * 5 10
         * / \ \
         * 3 6 11
         * \
         * 14
         */
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);
        root.right.right.right = new Node(14);

        root = delete(root, 5);
        inorder(root);
    }
}
