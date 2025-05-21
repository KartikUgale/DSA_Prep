// Problem Statement:- Count ways to reach the N'th stair, The person can climb either 1 stair or 2 stairs at a time.
// Time Compexity: O(n)     Space Compaxity: O(1)

public class ClimbingStairs_loopBest {
    public static int findWays(int n) {
        int prev = 1;
        int prevPrev = 1;
        int curr = 1;

        for (int i = 2; i <= n; i++) {
            curr = prev + prevPrev;
            prevPrev = prev;
            prev = curr;
        }
        return curr;
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(findWays(n));
    }
}