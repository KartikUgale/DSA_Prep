// Problem- Given the weights and values of N items in a knapsack of capacity W
//          to get the maximum total value in the knapsack.
// ans = 240

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int w = 50;

        double[][] ratio = new double[value.length][2]; // 0th col for index & 1st col for ratio
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // Sort 2D Array in assending order
        int capacity = w;
        int finalVal = 0;
        for (int i = value.length - 1; i >= 0; i--) { // Dessending order
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) { // if include full weight item
                finalVal += value[index];
                capacity -= weight[index];
            } else {
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final value = " + finalVal);
    }
}