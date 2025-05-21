import java.util.Stack;

public class DuplicateParanthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    count++;
                    s.pop();
                }
                if (count < 1) {
                    return true;
                }
            } else {
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // valid paranthesis provided
        String str = "(a+b)";
        System.out.println(isDuplicate(str));

        if (isDuplicate(str)) {
            System.out.println("Duplicate Paranathesis found");
        } else {
            System.out.println("not found");
        }
    }
}
