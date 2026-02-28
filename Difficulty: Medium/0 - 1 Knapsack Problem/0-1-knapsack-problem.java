class Solution {
    int[][] dp;
    public int knapsack(int W, int val[], int wt[]) {
        int n = val.length;
        dp = new int[n+1][W+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(W, val, wt, n);
    }
    
    public int helper(int W, int val[], int wt[], int n){
        if(n == 0 || W == 0) return 0;
        if(dp[n][W] != -1) return dp[n][W];
        if(wt[n-1] <= W){
            dp[n][W] = Math.max(val[n-1] + helper(W - wt[n-1], val, wt, n-1), helper(W, val, wt, n-1));
        }
        else dp[n][W] = helper(W, val, wt, n-1);
        return dp[n][W];
    }
}
