//Link - https://leetcode.com/problems/running-sum-of-1d-array/

class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] rnums = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            rnums[i] = sum;
            sum = 0;
        }
        return rnums;
    }
}