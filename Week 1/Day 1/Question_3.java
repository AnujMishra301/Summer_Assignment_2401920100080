class Solution {
    public int maxProfit(int[] prices) {
        int low=prices[0];
        int profit=0;
        for(int price:prices){
            if(price<low){
                low=price;
            }
            else{
                profit=Math.max(profit,price-low);
            }
        }
        return profit;
    }
}