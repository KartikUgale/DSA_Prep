import java.util.Stack;     //  Reverse string using stack this is very imp quesion
                            //  asked by Microsoft, amazon, adobe, flipkart and paytm
public class ReverseString {
    public static String reverseString(String str) {
        Stack<Character>s = new Stack<>();
        
        for(int index = 0; index < str.length(); index++){
            s.push(str.charAt(index));
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {                 
        String str = "abc";
        System.out.println(reverseString(str));
    }
}