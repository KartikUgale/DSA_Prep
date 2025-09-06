public class AddFirst_AddLast {  // before Head or after Tail
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

    public void addFirst(int data) {
        Node newNode = new Node(data); //constructor call and int data type memory create
        if (head == null) {         // if no node in memory then head is alwayes null
            head = tail = newNode; // newNode is tail & tail is Head. means same node is head and tail both.
            return;             // return to main function.
        }
        newNode.next = head;    // if there is no null head then our new node create and this newNode refers/ link to oldNode(Head node) data;
        head = newNode;            // newNode become head. 
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head==null) {
            head=tail=newNode;
        }
        tail.next = newNode;  // when newNode add at last after tail node. then tail node refer to this new node data.
        tail = newNode;         // newNode become tail of this linkedList
    }

    public static void main(String[] args) {
        AddFirst_AddLast ll = new AddFirst_AddLast();
        ll.addFirst(2); // "2" is Head and tail                              [2]-->Null
        ll.addFirst(1); // "1" is become head and 2 is tail            [1]-->[2]-->Null
        ll.addLast(3);  // "3" is become tail                          [1]-->[2]-->[3]-->Null
        ll.addLast(4);  // "4" is become tail                          [1]-->[2]-->[3]-->Null
    }
}