package com.dp.onedimensiondp.stocks;

// buy on less value day and sell it on high value to get the max profit . print the max profit
public class buysellstock_1 {

    public static int maxProfit(int[] prices) {
        int mini=prices[0];
        int max_profit=0;
        //as we cant have negative profit

        for(int i=1; i<prices.length; i++) {
            int cost=prices[i]-mini;
            max_profit=Math.max(max_profit,cost);
            mini=Math.min(mini,prices[i]);
        }
        return max_profit;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
