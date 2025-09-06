// Create Stack Using 2 Queues
// Method 2: push O(n) and O(1);

import java.util.Queue;
import java.util.LinkedList;

public class StackUsing2Queues_2 {
    public static class Stack {
        static Queue<Integer> q1 = new LinkedList<>();
        static Queue<Integer> q2 = new LinkedList<>();

        public static boolean isEmpty() {
            return q1.isEmpty() && q2.isEmpty();
        }

        public static void push(int data) {
            if (q1.isEmpty()) {
                q1.add(data);
                while (!q2.isEmpty()) {
                    q1.add(q2.remove());
                }
            } else {
                q2.add(data);
                while (!q1.isEmpty()) {
                    q2.add(q1.remove());
                }
            }
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            if (q1.isEmpty()) {
                return q2.remove();
            } else {
                return q1.remove();
            }
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            if (q1.isEmpty()) {
                return q2.peek();
            } else {
                return q1.peek();
            }
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}