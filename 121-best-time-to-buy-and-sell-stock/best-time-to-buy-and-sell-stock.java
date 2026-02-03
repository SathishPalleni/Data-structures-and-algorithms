class Solution {
    public int maxProfit(int[] prices) {
       int min_price = prices[0];
        int maxprofit = 0;
        for(int i =1; i<prices.length; i++){
            if(prices[i] < min_price){
                min_price = prices[i];
            }
            else {
                int current_proft = 0;
                current_proft = prices[i] - min_price;
                maxprofit = Math.max(maxprofit, current_proft);
            }
        }
        return maxprofit;
  
    }
}