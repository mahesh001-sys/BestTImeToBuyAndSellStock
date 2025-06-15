 class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            // Add profit if there's an increase in price from previous day
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit 1: " + solution.maxProfit(prices));     }
}
