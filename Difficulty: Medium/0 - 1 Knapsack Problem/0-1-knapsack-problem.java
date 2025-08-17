class Solution {
    static int knapsack(int W, int val[], int wt[]) {
        int n = wt.length;
        int[][] dp = new int[n+1][W+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= W; j++){
                dp[i][j] = -1;
            }
        }
        return helper(W, val, wt, n, dp);
    }
        static int helper(int W, int val[], int wt[], int n, int[][] dp) {
        if( n == 0 || W == 0){
            return 0;
        }
        if(dp[n][W] != -1){
            return dp[n][W]; 
        }
        if( wt[n-1] <= W){
            dp[n][W] = Math.max(val[n-1]+helper(W -wt[n-1], val, wt, n-1, dp ), helper(W, val, wt, n-1, dp)) ;
            
        }
        else{
            dp[n][W] = helper(W, val, wt, n-1, dp);
        }
        return dp[n][W];
        }

}
