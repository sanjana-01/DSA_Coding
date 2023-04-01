package com.Basics;

//Given a number N. Count the number of digits in N which evenly divides N.
//
//        Note :- Evenly divides means whether N is divisible by a digit i.e. leaves a remainder 0 when divided.
//
//
//        Example 1:
//
//        Input:
//        N = 12
//        Output:
//        2
//        Explanation:
//        1, 2 both divide 12 evenly
public class count_digits {
    static int evenlyDivides(int N){
        int r, c=0;
        int tmp=N;
        while(N!=0){
            r=N%10;
            if(r!=0){
                if(tmp%r ==0 ){
                    c++;
                }
            }
            N=N/10;
        }return c;
    }

    public static void main(String[] args) {
        int n=12;
        System.out.println(evenlyDivides(n));
    }
}
