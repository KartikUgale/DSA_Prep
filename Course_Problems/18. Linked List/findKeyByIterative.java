public class findKeyByIterative {
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
            head = tail = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("No data stored");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        findKeyByIterative ll = new findKeyByIterative();
        ll.add(1);
        ll.add(2);
        ll.add(20);
        ll.add(21);
        ll.print();

        int key = 20;
        if (searchKey(key) != -1) {
            System.out.println(key + " found at index " + searchKey(key));
        } else {
            System.out.println("Not Found");
        }
    }

    public static int searchKey(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
}
