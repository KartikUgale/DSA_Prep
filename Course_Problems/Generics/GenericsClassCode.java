public class GenericsClassCode<E> {
    public class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }

    private Node<E> head;
    private Node<E> tail;

    public void add(E data) {
        Node<E> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node<E> curr = head;

        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }

        System.out.println(curr);
    }

    public static void main(String[] args) {
        GenericsClassCode<Integer> ll1 = new GenericsClassCode<>();

        ll1.add(12);
        ll1.add(38);
        ll1.add(89);
        ll1.print();

        GenericsClassCode<Float> ll2 = new GenericsClassCode<>();
        ll2.add(1.2f);
        ll2.add(8.0f);
        ll2.print();

        GenericsClassCode<Boolean> ll3 = new GenericsClassCode<>();
        ll3.add(true);
        ll3.add(false);
        ll3.add(true);
        ll3.print();
    }
}