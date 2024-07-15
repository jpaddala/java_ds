public class stock {
    private int buy;
    private int maxprofit;

    public int minStock(int prices[]) {
        int minprice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            }
        }
        return minprice;
    }

    public int maxProfit(int prices[]) {
        int maxProfit = 0;
        int minPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

    public int output(int[] prices) {
        buy = minStock(prices);
        maxprofit = maxProfit(prices);
        return maxprofit; // Max profit itself
    }

    public static void main(String[] args) {
        stock stk = new stock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(stk.output(prices)); // Correct output: 5
    }
}
