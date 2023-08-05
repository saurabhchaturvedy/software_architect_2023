package Good_Solutions_Problems;

public class StockBuySell {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        
        int minPrice = prices[0];
        int maxProfit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            // Calculate the potential profit if we sell at the current price
            int potentialProfit = prices[i] - minPrice;
            
            // Update the maximum profit if the potential profit is greater
            maxProfit = Math.max(maxProfit, potentialProfit);
            
            // Update the minimum price if the current price is smaller
            minPrice = Math.min(minPrice, prices[i]);
        }
        
        return maxProfit;
    }

    public static void main(String[] args) {
        StockBuySell solution = new StockBuySell();

        int[] prices = {7, 1, 5, 3, 6, 4};
        int maxProfit = solution.maxProfit(prices);
        System.out.println("Maximum Profit: " + maxProfit);
    }
}
