public class DeleteNAfterMNodes {
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

    public void skipMdeleteN(int m, int n) {
        Node curr = head;
        int i = 1;
        while (i < m && curr != null) {
            curr = curr.next;
            i++;
        }
        Node temp = curr;
        i = 0;
        while (i <= n && temp != null) {
            temp = temp.next;
            i++;
        }
        curr.next = temp;
        // curr = temp;
    }

    public static void main(String[] args) {
        DeleteNAfterMNodes list = new DeleteNAfterMNodes();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);

        list.print();

        list.skipMdeleteN(2, 2);
        list.print();
    }
}
