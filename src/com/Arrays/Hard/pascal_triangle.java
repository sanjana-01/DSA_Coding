package com.Arrays.Hard;

// Approach 1 : bruteforce by formula of nCr = n!/(n-r)!r!  --> n-i/i+1
//Approach 2 : by using matrix pattern indices diagonal are always 1's and remaining follow i-1,j-1 + i-1,j
public class pascal_triangle {
    static void pascal(int n,int[][] a){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i==j||j==0)                  // diagonal elements are 1's
                    a[i][j]=1;
                else
                    a[i][j]=a[i-1][j-1]+a[i-1][j];      // if you observe pattern of matrix (1,0)+(1,1)=(2,1)
                System.out.print(a[i][j]);

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n=5;
        int[][] a=new int[10][10];
        pascal(n,a);
    }
}
