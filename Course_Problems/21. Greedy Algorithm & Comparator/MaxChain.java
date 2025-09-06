import java.util.Arrays;
import java.util.Comparator;

public class MaxChain { // This Que is similar to Max Activities
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } }; // {start,end}

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1])); // sort on the end basis

        int chainLength = 1;
        int chainEnd = pairs[0][1]; // initiate
        for (int i = 0; i < pairs.length; i++) {
            if (pairs[i][0] >= chainEnd) {
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println("Maximum length of chain = " + chainLength);
    }
}
