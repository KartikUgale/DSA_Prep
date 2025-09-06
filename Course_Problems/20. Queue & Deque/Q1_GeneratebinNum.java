import java.util.Queue;
import java.util.LinkedList;

public class Q1_GeneratebinNum { // Q.1 Generate Binary numbers
    public static void genBin(int n) {
        Queue<String> q = new LinkedList<String>();
        q.add("1");
        while (n-- > 0) {
            String s1 = q.remove();
            System.out.println(s1);
            String s2 = s1;
            q.add(s1 + "0");
            q.add(s2 + "1");
        }
    }

    public static void main(String[] args) {
        int n = 10;
        genBin(n);
    }
}