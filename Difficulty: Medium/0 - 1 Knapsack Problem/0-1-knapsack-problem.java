class Solution {
    public int knapsack(int W, int val[], int wt[]) {
        // code here
        //base case
        int n = val.length;
        int[][] dp = new int[n+1][W+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        int result = helper(W, val, wt, n, dp);
        return result;
    }
    
    public int helper(int W, int val[], int wt[], int n, int[][] dp){
        if(n == 0 || W == 0) {
            return 0;
        }
        if(dp[n][W] != -1) return dp[n][W];
        else if(wt[n-1] <= W){
             dp[n][W] = Math.max(val[n-1] + helper(W - wt[n-1], val, wt, n-1, dp), helper(W, val, wt, n-1, dp));
        }
        else dp[n][W] = helper(W, val, wt, n-1, dp);
        return dp[n][W];
    }
}
