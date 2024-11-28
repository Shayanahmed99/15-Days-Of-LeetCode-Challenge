class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = prices[0];
        for(int i = 1; i<prices.length; i++){
            int temp = prices[i] - buy;
            if(temp > profit){
                profit = temp;
            }
            if(prices[i] < buy){
                buy = prices[i];
            }
        }
        return profit;
    }
}