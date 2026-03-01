class Solution {
    int[][] dp;
    public int count(int coins[], int sum) {
        int n = coins.length;
        dp = new int[n+1][sum+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(coins, sum, n);
    }
    
    public int helper(int wt[], int W, int n){
        if(W == 0) return 1;
        if(n == 0 && W > 0) return 0;
        if(dp[n][W] != -1) return dp[n][W];
        if(wt[n-1] <= W){
             dp[n][W] = helper(wt, W - wt[n-1], n) + helper(wt, W, n-1);
        }
        else dp[n][W] = helper(wt, W, n-1);
        return dp[n][W];
    }
}