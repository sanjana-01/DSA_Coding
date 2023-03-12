//Given an integer x, return true if x is a
//        palindrome
//        , and false otherwise.
//
//
//
//        Example 1:
//
//        Input: x = 121
//        Output: true
//        Explanation: 121 reads as 121 from left to right and from right to left.

public class palindrome {
    public boolean isPalindrome(int x) {
        int temp=x,l,rev=0;
        if(x<0)
            return false;
        while(x!=0){
            l=x%10;
            rev=(rev*10)+l;
            x=x/10;
        }
        return (temp==rev);
    }
}
