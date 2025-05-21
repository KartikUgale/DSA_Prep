public class ZigZagLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node midFinder(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public void zigzag() {
        if (head == null || head.next == null) {
            return;
        }
        // find mid
        Node mid = midFinder(head);

        Node rightHead = mid.next;
        mid.next = null;

        // reverse second half
        Node curr = rightHead;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // merge two Lists alternatively
        rightHead = prev;
        Node leftHead = head;
        Node nextL, nextR;
        while (leftHead != null && rightHead != null) {
            nextL = leftHead.next;
            leftHead.next = rightHead;
            nextR = rightHead.next;
            rightHead.next = nextL;

            leftHead = nextL;
            rightHead = nextR;
        }
    }

    public static void main(String[] args) {
        ZigZagLinkedList list = new ZigZagLinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);

        System.out.println("Original List:");
        list.print();

        list.zigzag();

        System.out.println("new List:");
        list.print();
    }
}