class Solution {
    public int count(int coins[], int sum) {
        int n = coins.length;
        int[][] dp = new int[n+1][sum+1];
       for(int i = 0; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                dp[i][j] = -1;
            }
        }
        return helper(coins, sum, n, dp);
    }
    
    public int helper(int coins[], int sum, int n, int[][] dp){
        if(sum == 0){
            return 1;
        }
        if( n == 0){
            return 0;
        }
        if(dp[n][sum] != -1){
            return dp[n][sum];
        }
        //int count = 0;
        if(coins[n-1] <= sum){
            dp[n][sum] = helper(coins, sum - coins[n-1], n, dp) + helper(coins, sum, n-1, dp);
        }
        else{
            dp[n][sum] = helper(coins, sum, n-1, dp);
        }
        return dp[n][sum];
    }
}