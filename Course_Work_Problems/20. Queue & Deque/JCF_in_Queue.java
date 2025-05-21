import java.util.Queue; // LinkedList, Queue using JCF
import java.util.LinkedList;
import java.util.ArrayDeque;

public class JCF_in_Queue {
    public static void main(String[] args) { // Note- Queue is an interface, so we can't create object of it
        Queue<Integer> q1 = new LinkedList<>(); // example of LinkedList and Queue using JCF
        q1.add(1);
        q1.add(2);
        q1.add(3);

        while (!q1.isEmpty()) {
            System.out.println(q1.remove());
        }

        Queue<Integer> q2 = new ArrayDeque<>(); // example of ArrayDeque and Queue using JCF
        q2.add(10);
        q2.add(20);
        q2.add(30);

        while (!q2.isEmpty()) {
            System.out.println(q2.remove());
        }
    }
}