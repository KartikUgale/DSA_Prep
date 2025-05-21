import java.util.PriorityQueue;

public class PriorityQueue_1st {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3); // O(logn)
        pq.add(2);
        pq.add(6);
        pq.add(1);
        pq.add(4);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " "); // O(1) // Smaller numbers have first priority
            pq.remove(); // O(logn)
        }
    }
}