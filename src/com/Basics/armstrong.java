//For a given 3 digit number, find whether it is armstrong number or not. An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself. Return "Yes" if it is a armstrong number else return "No".
//        NOTE: 371 is an Armstrong number since 33 + 73 + 13 = 371
//
//        Example 1:
//
//        Input: N = 153
//        Output: "Yes"
//        Explanation: 153 is an Armstrong number
//        since 13 + 53 + 33 = 153.
//        Hence answer is "Yes".
public class armstrong {
    static String armstrongNumber(int n){
        // code here
//        int num=n;
//        int n1=n%10;
//        n=n/10;
//        int n2=n%10;
//        int n3=n/10;
//        int cube=(n1*n1*n1)+(n2*n2*n2)+(n3*n3*n3);
//        if(cube == num){
//            return "Yes";
//        }
//        else
//            return "No";
        int num=n;
        int sum=0,r;
        while(n!=0){
            r=n%10;
            sum+=(r*r*r);
            n=n/10;
        }
        if(num==sum)
            return "Yes";
        else
            return "No";
    }
}
