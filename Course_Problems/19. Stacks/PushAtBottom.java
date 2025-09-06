import java.util.Stack; // (Push at bottom) Quetion asked by amazon

public class PushAtBottom {
    public static void PushAt_bottom(Stack<Integer> s, int val) {
        if (s.isEmpty()) {
            s.push(val);
            return;
        }
        int top = s.pop();
        PushAt_bottom(s, val);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        PushAt_bottom(s, 4);
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}