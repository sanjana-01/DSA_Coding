package com.BinarySearch;
/**/
public class kth_element_sorted_array {
    static int findkthelement(int[] nums1, int[] nums2,int n,int m,int k) {
     if (n >m)
            return findkthelement(nums2, nums1,n,m,k);
    int n1 = nums1.length;
    int n2 = nums2.length;

    int low = 0, high = n1;
        while (low <= high) {
        int c1 = (low + high) / 2;
        int c2 = (n1 + n2 + 1) / 2 - c1;
        // edge cases
        int l1 = c1 == 0 ? Integer.MIN_VALUE : nums1[c1 - 1];         // if we are not taking anything from left make it min
        int l2 = c2 == 0 ? Integer.MIN_VALUE : nums2[c2 - 1];
        int r1 = c1 == n1 ? Integer.MAX_VALUE : nums1[c1];             // if we are not taking anything from right make it max
        int r2 = c2 == n2 ? Integer.MAX_VALUE : nums2[c2];

        if (l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
        } else if (l1 > r2) {
            high = c1 - 1;                  // if greater element reduce it by decrease cut
        } else
            low = c1 + 1;                   // if lesser element increase it by incr cut

    }
        return 1;
}

    public static void main(String[] args) {
        int n=3,m=4,k=4;
        int a1[]={2,3,45};
        int a2[]={4,6,7,8};
        System.out.println(findkthelement(a1,a2,n,m,k));
    }

}
