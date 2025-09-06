public class Q1CheckPalindrom {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    public boolean isPalindrome() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node mid = slow;

        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Q1CheckPalindrom ll = new Q1CheckPalindrom();
        ll.head = new Node('a');
        ll.head.next = new Node('b');
        ll.head.next.next = new Node('c');
        ll.head.next.next.next = new Node('b');
        ll.head.next.next.next.next = new Node('a');

        System.out.println(ll.isPalindrome());
    }
}
