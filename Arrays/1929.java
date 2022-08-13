//Link - https://leetcode.com/problems/concatenation-of-array/

class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] nums2 = new int[2 * n];
        for (int i = 0; i < n; i++) {
            nums2[i] = nums[i];
            nums2[i + n] = nums[i];
        }
        return nums2;
    }
}