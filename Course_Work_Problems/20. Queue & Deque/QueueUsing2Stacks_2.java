// Que.- create a Queue using 2 Stacks.
// Method 2: use add O(1) and remove O(n)

import java.util.Stack;

public class QueueUsing2Stacks_2 { // this Question is very very Important asked by Google, Amazon, Microsoft, Adobe, etc.
    public static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        public static void add(int data) {
            s1.push(data);
        }

        public static int remove() {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            int num = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return num;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            int num = s2.peek();

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }

            return num;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
