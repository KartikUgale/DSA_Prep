public class SwapNodes {
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

    public void swapNodes(int x, int y) {
        Node curr = head;
        int i = 1;
        while (i < x) {
            if (curr == null) {
                return;
            }
            curr = curr.next;
            i++;
        }
        Node temp = curr;
        while (i < y) {
            if (temp == null) {
                return;
            }
            temp = temp.next;
            i++;
        }
        int t = curr.data;
        curr.data = temp.data;
        temp.data = t;
    }

    public static void main(String[] args) {
        SwapNodes list = new SwapNodes();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(5);
        list.head.next.next.next.next.next = new Node(6);
        list.head.next.next.next.next.next.next = new Node(7);

        list.print();

        list.swapNodes(2, 4);
        list.print();
    }
}
