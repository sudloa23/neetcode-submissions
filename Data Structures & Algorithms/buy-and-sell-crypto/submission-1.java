class Solution {
    public int maxProfit(int[] prices){
        int lowestBuyIndex = 0;
        int maxProfit  = 0;
        for(int i = 1; i < prices.length; i++){
            if(prices[lowestBuyIndex] > prices[i]){
                lowestBuyIndex = i;
            }

            if(prices[i] - prices[lowestBuyIndex] > maxProfit){
                maxProfit = prices[i] - prices[lowestBuyIndex];
            }
        }
        return maxProfit;
    }
}
