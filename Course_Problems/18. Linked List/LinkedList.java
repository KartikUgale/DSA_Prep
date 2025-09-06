public class LinkedList {
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

    public void addFirst(int data) { // Add First Method
        Node newNode = new Node(data); // constructor call and int data type memory create
        size++;
        if (head == null) {// if no node in memory then head is alwayes null
            head = tail = newNode; // newNode is tail & tail is Head. means same node is head and tail both.
            return; // return to main function.
        }
        newNode.next = head; // if there is no null head then our new node create and this newNode refers/
                             // link to oldNode(Head node) data;
        head = newNode; // newNode become head.
    }

    public void addLast(int data) { // Add Last Method
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode; // when newNode add at last after tail node. then tail node refer to this new
                             // node data.
        tail = newNode; // newNode become tail of this linkedList
    }

    public void print() {
        Node temp = head; // initially temp is head
        while (temp != null) { // it will run until temp is at null
            System.out.print(temp.data + "-->"); // print data at current temp
            temp = temp.next; // update temp as next node
        }
        System.out.println("null"); // print last
    }

    public void add(int index, int data) { // add new node at i index
        if (index == 0) { // if index is 0 then this is addFirst method
            addFirst(data);
            return;
        } else {
            Node newNode = new Node(data); // "Node(data)" constructor call which create int data type space with
                                           // "newNode" variable
            size++;
            Node temp = head; // temp initionlize with head
            int i = 0;
            while (i != index - 1) { // loop run until reach to previous index of required index
                temp = temp.next; // temp update as next node
                i++; // our i increased by 1;
            }
            newNode.next = temp.next; // new node refer to refer of temp
            temp.next = newNode; // temp refer to newNode
        }
    }

    public void removeFirst() {
        if (size == 0) {
            System.out.println("no data stored");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            head = head.next;
            size--;
        }
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("No data Stored");
        } else if (size == 1) {
            head = tail = null;
            size = 0;
        } else {
            Node prev = head;
            while (prev.next != tail) {
                prev = prev.next;
            }
            prev.next = null;
            tail = prev;
            size--;
        }
    }

    public void remove(int index) {
        if (size == 0 || size == 1) {
            removeFirst();
            return;
        }
        Node temp = head;
        int i = 0;
        while (i != index - 1) {
            temp = temp.next;
            i++;
        }
        Node prev = temp;
        temp = temp.next;
        prev.next = temp.next;
        size--;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print(); // print method call
        ll.addFirst(2); // "2" is Head and tail [2]-->Null
        ll.print();
        ll.addFirst(1); // "1" is become head and 2 is tail [1]-->[2]-->Null
        ll.print();
        ll.addLast(3); // "3" is become tail [1]-->[2]-->[3]-->Null
        ll.print();
        ll.addLast(4); // "4" is become tail [1]-->[2]-->[3]-->[4]-->Null
        ll.print();

        ll.add(2, 9); // "9" is added at index (2) [1]-->[2]-->[9]-->[3]-->[4]-->null
        ll.print();

        ll.removeFirst(); // "1" removed [2]-->[9]-->[3]-->[4]-->null
        ll.print();

        ll.removeLast(); // "4" is removed [2]-->[9]-->[3]-->null
        ll.print();

        ll.remove(1); // index (1) data which is "9" is removed [2]-->[3]-->null
        ll.print();

        System.out.println("ll size = " + ll.size); // size Method call which return the size of LinkedList.
    }
}