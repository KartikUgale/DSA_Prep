// Create Stack using 2 Queues
// Method 1: push O(1) and pop O(n)

import java.util.Queue;
import java.util.LinkedList;

public class StackUsing2Queues_1 {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (!q1.isEmpty()) {
                q1.add(data);
            } else {
                q2.add(data);
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                return q1.remove();
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                return q2.remove();
            }
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty stack");
                return -1;
            }
            int num = -1;
            if (!q1.isEmpty()) {
                while (q1.size() > 1) {
                    q2.add(q1.remove());
                }
                num = q1.peek();
                q2.add(q1.remove());
                return num;
            } else {
                while (q2.size() > 1) {
                    q1.add(q2.remove());
                }
                num = q2.peek();
                q1.add(q2.remove());
                return num;
            }
        }
    }

    public static void main(String[] args) {
        Stack q = new Stack(); // LIFO
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.pop();
        }
    }
}
