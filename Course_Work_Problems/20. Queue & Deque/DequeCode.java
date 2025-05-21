import java.util.LinkedList;
import java.util.Deque;

public class DequeCode {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        System.out.println(dq);

        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);

        dq.removeFirst();
        System.out.println(dq);

        dq.removeLast();
        System.out.println(dq);
    }
}
