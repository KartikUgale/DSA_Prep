public class DoublyLinkedList {// Double directions
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) { // addFirst
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            addFirst(data);
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public int removeFirst() {
        if (head == null) {
            print();
            return Integer.MIN_VALUE;
        }
        size--;
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            print();
            return Integer.MIN_VALUE;
        }
        size--;
        if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        tail = tail.prev;
        tail.next = null;
        return val;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(1);
        dll.print();
        dll.addLast(2);
        dll.print();
        dll.addLast(3);
        dll.print();
        dll.addFirst(0);
        dll.print();

        // dll.reverse();
        // dll.print();

        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
    }
}
