package com.Basics;

//doWhat do you do when you need to execute certain statements more than once? You put them in a loop. Loops are very powerful. Majority of coding questions need loops to work. You can't even input testcases without loops!
//
//        Here, we will use for loop and check if the given number n is prime or not.
//        Note: A number is prime if it's divisible by itself and 1. Also, 1 is not prime.
//
//        Example 1:
//
//        Input:
//        1
//
//        Output:
//        No
public class forloop {
    static void isPrime(int n) {
        int c=0;
        for(int i = 1; i <= n; i++) {
            // Your code here
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String[] args) {
        int n=3;
        System.out.println(isPrime(n));
    }
}
