import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;

public class IndianCoin {
    public static void main(String[] args) {
        Integer[] coin = { 10, 5, 2, 1, 500, 20, 2000, 100, 50 };
        int amount = 1059;
        Arrays.sort(coin, Comparator.reverseOrder());

        ArrayList<Integer> coinUse = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < coin.length; i++) {
            if (coin[i] <= amount) {
                while (coin[i] <= amount) {
                    coinUse.add(coin[i]);
                    count++;
                    amount -= coin[i];
                }
            }
        }
        System.out.println("total minimum sets = " + count);

        for (int i = 0; i < coinUse.size(); i++) {
            System.out.print(coinUse.get(i) + " ");
        }
    }
}