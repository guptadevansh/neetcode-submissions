class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i = 0; i < prices.length; i++)
        {
            int j = i + 1;
            while(j < prices.length)
            {
                if(prices[i] >= prices[j]) j++;
                else
                {
                    profit = Math.max(profit, prices[j] - prices[i]);
                    j++;
                }
            }
        }
        return profit;
    }
}
