import java.util.ArrayList;     // Stack using ArrayList

public class ArrayListStacks {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        // Push (add)
        public void push(int data) {
            list.add(data);
        }

        // Pop (delete)
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        // Peek (see)
        public int peek() {
            return list.get(list.size() - 1);
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