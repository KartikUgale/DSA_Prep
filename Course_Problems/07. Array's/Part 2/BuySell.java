public class BuySell {
    public static int profit(int[] price) {
        int buyPrice = price[0];
        int maxProfit = 0;
        for (int i = 1; i < price.length; i++) {
            buyPrice = Math.min(buyPrice, price[i]);
            maxProfit = Math.max(maxProfit, price[i] - buyPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 4, 2, 5, 3, 6, 1 };
        System.out.println("Max Profit: " + profit(prices));
    }
}
