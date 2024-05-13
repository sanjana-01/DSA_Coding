package com.dp.onedimensiondp.subsequence;
import java.util.Arrays;

public class rod_cutting_lenght {

        static int cutRodRecursion(int[] price, int ind, int N){

            if(ind == 0){
                return N*price[0];
            }
            int notTaken = 0 + cutRodRecursion(price,ind-1,N);

            int taken = Integer.MIN_VALUE;
            int rodLength = ind+1;
            if(rodLength <= N)
                taken = price[ind] + cutRodRecursion(price,ind,N-rodLength);

            return Math.max(notTaken,taken);
        }

        static int cutRodRec(int[] price,int N) {

            int dp[][]=new int[N][N+1];
            return cutRodRecursion(price,N-1,N);
        }


        static int cutRodUtil(int[] price, int ind, int N,int[][] dp){

            if(ind == 0){
                return N*price[0];
            }

            if(dp[ind][N]!=-1)
                return dp[ind][N];

            int notTaken = 0 + cutRodUtil(price,ind-1,N,dp);

            int taken = Integer.MIN_VALUE;
            int rodLength = ind+1;
            if(rodLength <= N)
                taken = price[ind] + cutRodUtil(price,ind,N-rodLength,dp);

            return dp[ind][N] = Math.max(notTaken,taken);
        }

        static int cutRodMemo(int[] price,int N) {

            int dp[][]=new int[N][N+1];
            for(int row[]:dp)
                Arrays.fill(row,-1);
            return cutRodUtil(price,N-1,N,dp);
        }

        static int cutRodTabulation(int[] price,int N) {

            int dp[][]=new int[N][N+1];

            for(int row[]:dp)
                Arrays.fill(row,-1);

            for(int i=0; i<=N; i++){
                dp[0][i] = i*price[0];
            }

            for(int ind=1; ind<N; ind++){
                for(int length =0; length<=N; length++){

                    int notTaken = 0 + dp[ind-1][length];

                    int taken = Integer.MIN_VALUE;
                    int rodLength = ind+1;
                    if(rodLength <= length)
                        taken = price[ind] + dp[ind][length-rodLength];

                    dp[ind][length] = Math.max(notTaken,taken);
                }
            }

            return dp[N-1][N];
        }

        static int cutRodSpaceOptimised(int[] price,int N) {

            int cur[]=new int[N+1];

            for(int i=0; i<=N; i++){
                cur[i] = i*price[0];
            }

            for(int ind=1; ind<N; ind++){
                for(int length =0; length<=N; length++){

                    int notTaken = 0 + cur[length];

                    int taken = Integer.MIN_VALUE;
                    int rodLength = ind+1;
                    if(rodLength <= length)
                        taken = price[ind] + cur[length-rodLength];

                    cur[length] = Math.max(notTaken,taken);
                }
            }

            return cur[N];
        }


        public static void main(String[] args) {


        }
    }
}
