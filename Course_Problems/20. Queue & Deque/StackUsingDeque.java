import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {
    public static class Stack {
        Deque<Integer> dq = new LinkedList<>();

        public boolean isEmpty() {
            return dq.isEmpty();
        }

        public void push(int data) {
            dq.addLast(data);
        }

        public int pop() {
            if (dq.isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }

            return dq.removeLast();
        }

        public int peek() {
            if (dq.isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }

            return dq.getLast();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.peek());

        while (!s.isEmpty()) {
            System.out.print(s.peek() + " ");
            s.pop();
        }

    }
}
