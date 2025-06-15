class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) return 0; // No prices, no profit

        int max_profit = 0; // Initialize max_profit to 0
        int buy_price = prices[0];

        for (int i = 1; i < n; i++) {
            int curr_profit = prices[i] - buy_price;
            if (curr_profit > max_profit) {
                max_profit = curr_profit;
            }
            if (prices[i] < buy_price) {
                buy_price = prices[i];
            }
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit : " + maxProfit(prices));
    }
}
