//Link - https://leetcode.com/problems/build-array-from-permutation/

class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] pnums = new int[n];
        for (int i = 0; i < n; i++) {
            pnums[i] = nums[nums[i]];
        }
        return pnums;
    }
}