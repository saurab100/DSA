class Solution {
    int[][] dp;
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        dp = new int[n+1][target+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(nums, target, n);
    }
    
    public int helper(int[] nums, int target, int n){
        if(target == 0  && n == 0) return 1;
        if(n == 0 && target > 0) return 0;
        if(dp[n][target] != -1) return dp[n][target];
        if(nums[n-1] <= target){
            dp[n][target] =  helper(nums, target - nums[n-1], n-1) + helper(nums, target, n-1);
        }
        else dp[n][target] = helper(nums, target, n-1);
        return dp[n][target];
    }
}