class Solution {
    // Function to calculate the number of subsets with a given sum
    public int perfectSum(int[] nums, int target) {
        // code here
        int n = nums.length;
        int count = 0;
        int[][] dp = new int[n+1][target+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= target; j++){
                dp[i][j] = -1;
            }
        }
        return helper(nums, target, n, dp);
        
    }
    
    public int helper(int[] nums, int target,int n, int[][] dp){
        if(target == 0 && n == 0){
            return 1;
        }
        if (n == 0){
            return 0;
        }
        if(dp[n][target] != -1){
            return dp[n][target];
        }
        int count = 0;
        if(nums[n-1] <= target){
            dp[n][target] = helper(nums, target - nums[n-1], n-1, dp) + helper(nums, target, n-1, dp);
        }
        else{
            dp[n][target] = helper(nums, target, n-1, dp);
        }
        return dp[n][target];
    }
}