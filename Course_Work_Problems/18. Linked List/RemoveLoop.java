public class RemoveLoop {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = null;
            return;
        }
        head.next = newNode;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean isloopInList() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void loopRemove() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = fast;
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) { // loop is detect
                loop = true;
                break;
            }
        }
        if (loop == false) {
            return;
        }

        // if loop creating Node is head;
        if (slow == head) { // Corner case
            prev.next = null;
            return;
        }

        // find loop creating Node
        slow = head;
        prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        // create it last Node
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head;

        System.out.println(isloopInList());
        loopRemove();
        System.out.println(isloopInList());
    }
}