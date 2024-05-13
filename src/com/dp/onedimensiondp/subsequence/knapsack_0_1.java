package com.dp.onedimensiondp.subsequence;
import java.util.Arrays;
public class knapsack_0_1 {
    public class Knapsack_0_1 {

        /**
         * A thief wants to rob a store. He is carrying a bag of capacity W.
         * The store has ‘n’ items. Its weight is given by the ‘wt’ array and its value by the ‘val’ array. He can either include an item in its knapsack or
         * exclude it but can’t partially have it as a fraction. We need to find the maximum value of items that the thief can steal.
         */
        static int knapsackRecursion(int[] wt,int[] val, int ind, int W){

            if(ind == 0){
                if(wt[0] <=W) return val[0];
                else return 0;
            }

            int notTaken = 0 + knapsackRecursion(wt,val,ind-1,W);

            int taken = Integer.MIN_VALUE;
            if(wt[ind] <= W)
                taken = val[ind] + knapsackRecursion(wt,val,ind-1,W-wt[ind]);

            return  Math.max(notTaken,taken);
        }


        static int knapsackR(int[] wt,int[] val, int n, int W){
            return knapsackRecursion(wt, val, n-1, W);
        }

        static int knapsackMemo(int[] wt,int[] val, int ind, int W,int[][] dp){

            if(ind == 0){
                if(wt[0] <=W) return val[0];
                else return 0;
            }

            if(dp[ind][W]!=-1)
                return dp[ind][W];

            int notTaken = 0 + knapsackMemo(wt,val,ind-1,W,dp);

            int taken = Integer.MIN_VALUE;
            if(wt[ind] <= W)
                taken = val[ind] + knapsackMemo(wt,val,ind-1,W-wt[ind],dp);

            return dp[ind][W] = Math.max(notTaken,taken);
        }


        static int knapsackM(int[] wt,int[] val, int n, int W){

            int dp[][]= new int[n][W+1];

            for(int row[]: dp)
                Arrays.fill(row,-1);
            return knapsackMemo(wt, val, n-1, W,dp);
        }


        static int knapsackTab(int[] wt,int[] val, int n, int W){

            int dp[][] = new int[n][W+1];

            //Base Condition

            for(int i=wt[0]; i<=W; i++){
                dp[0][i] = val[0];
            }

            for(int ind =1; ind<n; ind++){
                for(int cap=0; cap<=W; cap++){

                    int notTaken = 0 + dp[ind-1][cap];

                    int taken = Integer.MIN_VALUE;
                    if(wt[ind] <= cap)
                        taken = val[ind] + dp[ind-1][cap - wt[ind]];

                    dp[ind][cap] = Math.max(notTaken, taken);
                }
            }

            return dp[n-1][W];
        }

        static int knapsackSpaceOptimised(int[] wt,int[] val, int n, int W){

            int prev[]=new int[W+1];

            //Base Condition

            for(int i=wt[0]; i<=W; i++){
                prev[i] = val[0];
            }

            for(int ind =1; ind<n; ind++){
                for(int cap=W; cap>=0; cap--){

                    int notTaken = 0 + prev[cap];

                    int taken = Integer.MIN_VALUE;
                    if(wt[ind] <= cap)
                        taken = val[ind] + prev[cap - wt[ind]];

                    prev[cap] = Math.max(notTaken, taken);
                }
            }

            return prev[W];
        }


        public static void main(String[] args) {


        }
    }
}
