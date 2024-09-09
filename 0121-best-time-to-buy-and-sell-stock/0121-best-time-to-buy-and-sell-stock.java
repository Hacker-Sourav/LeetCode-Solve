class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int buy=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>buy){
                int profit=prices[i]-buy;
                maxprofit=profit>maxprofit?profit:maxprofit;
            }
            else
                buy=prices[i];
        }
        return maxprofit;
    }
}