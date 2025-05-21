public class SearchKeyByRecursion {
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

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.print("No data Available");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SearchKeyByRecursion ll = new SearchKeyByRecursion();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(5);
        ll.addLast(8);
        ll.print();

        System.out.println(ll.recSearch(5));
    }

    public static int recSearch(int key) {
        return findKey(head, key);
    }

    public static int findKey(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int index = findKey(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index + 1;
    }
}