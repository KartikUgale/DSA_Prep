public class Palindrome {
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data) { // addLast
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("No data Stored");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.add(1);
        ll.add(2);
        ll.add(1);
        ll.add(1);
        ll.add(2);
        ll.add(1);

        ll.print();
        System.out.println(ll.checkPalindrome());
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Find mid
        Node mid = findMidNode(head);

        // reverse second half
        Node prev = null;
        Node curr = mid;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;

        // check if not equal
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    private Node findMidNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}