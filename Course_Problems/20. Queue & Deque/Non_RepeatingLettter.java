// import java.util.*;

// public class Non_RepeatingLettter {
//     public static void nonRepeatingChar(String str){
//         int[] freq = new int [26];
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++){
//             char ch = str.charAt(i);
//             q.add(ch);
//             freq[ch-'a']++;

//             while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
//                 q.remove();
//             }

//             if(q.isEmpty()) {
//                 System.out.print(-1+" ");
//             }else{
//                 System.out.print(q.peek()+" ");
//             }
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         String str = "aabccxb";
//         nonRepeatingChar(str);
//     }
// }

import java.util.Queue;
import java.util.LinkedList;

public class Non_RepeatingLettter {
    public static void nonRepeatingChar(String s) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
    }

    public static void main(String[] args) {
        String str = "aabbeddexa";
        nonRepeatingChar(str);
    }
}