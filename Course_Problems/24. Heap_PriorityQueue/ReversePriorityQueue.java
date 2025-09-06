import java.util.PriorityQueue;
import java.util.Comparator;

public class ReversePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(4);
        pq.add(5);
        pq.add(7);
        pq.add(3);
        pq.add(9);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}
