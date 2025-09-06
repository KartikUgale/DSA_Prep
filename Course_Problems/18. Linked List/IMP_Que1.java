// Find and remove Nth Node from end        (Asked by Amazon, Flipkart, Qualcomm)

public class IMP_Que1 {
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
    public static int size;

    public void add(int data) {
        Node newNode = new Node(data);
        size++;
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
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void remove(int index) {
        if (head == null) {
            System.out.println("No data Stored");
            return;
        } else if (head.next == null) {
            head = tail = null;
            size = 0;
            return;
        }
        Node prev = head;
        int i = 1;
        while (i < index) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
    }

    public void removeNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        int fromFrontIdx = size - n;
        remove(fromFrontIdx);
    }

    public static void main(String[] args) {
        IMP_Que1 ll = new IMP_Que1();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        ll.print();

        ll.removeNthFromEnd(3);
        ll.print();
    }
}
