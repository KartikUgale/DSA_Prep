import java.util.Queue;
import java.util.LinkedList;

public class QueueCode {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1); // or use .add(1)
        q.offer(2);
        q.offer(3);

        System.out.println(q);

        q.poll();   // it will give null if q is empty, but .remove gives exception
        System.out.println(q);

        System.out.println(q.peek());
    }
}
