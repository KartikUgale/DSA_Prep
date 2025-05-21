import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(Stack<Integer> s, int top) {
        if (s.isEmpty()) {
            s.push(top);
            return;
        }
        int val = s.pop();
        pushAtBottom(s, top);
        s.push(val);
    }

    public static void reverse_stack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverse_stack(s);
        pushAtBottom(s, top);
    }

    public static void printStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        reverse_stack(s);
        printStack(s);
    }
}