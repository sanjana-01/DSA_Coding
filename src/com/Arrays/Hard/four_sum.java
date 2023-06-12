package com.Arrays.Hard;
import java.util.*;
public class four_sum {
    static List<List<Integer>> ans=new ArrayList<>();
        public static List<List<Integer>> fourSum(int[] nums, int target) {
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;
                for (int j = i + 1; j < nums.length; j++) {
                    if (j != (i + 1) && nums[j] == nums[j - 1]) continue;
                    int k = j + 1;
                    int l = nums.length - 1;
                    while (k < l) {
                        int sum = nums[i] + nums[j] + nums[k] + nums[l];
                        if (sum > target)
                            l--;
                        else if (sum < target)
                            k++;
                        else {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[k]);
                            list.add(nums[l]);
                            ans.add(list);

                            while (k < l && nums[k] == nums[k + 1]) k++;
                            while (k < l && nums[l] == nums[l - 1]) l--;
                            k++;
                            l--;
                        }
                    }
                }
            }
            return ans;
        }

    public static void main(String[] args) {
        int[] a={1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>>  ans=fourSum(a,target);
        for(List<Integer> i:ans)
            System.out.println(i+" ");

    }
    }