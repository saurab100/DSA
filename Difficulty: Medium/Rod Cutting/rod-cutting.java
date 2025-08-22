class Solution {
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int[] wt = new int[n];
        for(int i = 0; i < n; i++){
            wt[i] = i+1;
        }
        int[][] dp = new int[n+1][n+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return helper(price, wt, n, n, dp);
    }
    
    public int helper(int[] price, int[] wt, int cap, int n, int[][] dp){
        if(cap == 0 || n == 0){
            return 0;
        }
        if(dp[n][cap] != -1){
            return dp[n][cap];
        }
        if(wt[n-1] <= cap){
            dp[n][cap] =  Math.max(price[n-1] + helper(price, wt, cap - wt[n-1], n, dp),
            helper(price, wt, cap, n-1, dp));
        }
        else{
            dp[n][cap] =  helper(price, wt, cap, n-1, dp);
        }
        return dp[n][cap];
    }
}