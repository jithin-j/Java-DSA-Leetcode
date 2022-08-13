//Link - https://leetcode.com/problems/richest-customer-wealth/

class Solution {
    public int maximumWealth(int[][] accounts) {
        int[] sum = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[0].length; j++) {
                sum[i] += accounts[i][j];
            }
        }
        int max = sum[0];
        for (int k = 1; k < sum.length; k++) {
            if (sum[k] > max)
                max = sum[k];
        }
        return max;
    }
}