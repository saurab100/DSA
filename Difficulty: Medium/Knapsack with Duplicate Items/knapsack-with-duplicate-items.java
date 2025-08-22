// User function Template for Java

class Solution {
    static int knapSack(int val[], int wt[], int capacity) {
        int n = val.length;
        int[][] dp = new int[capacity+1][n+1];
        for(int i = 0; i <= capacity; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return helper(val, wt, capacity, n, dp);
    }
    
    static int helper(int val[], int wt[], int capacity, int n, int[][] dp){
        if(capacity == 0 || n == 0){
            return 0;
        }
        if(dp[capacity][n] != -1){
            return dp[capacity][n];
        }
        if(wt[n-1] <= capacity){
            dp[capacity][n] =  Math.max((val[n-1] + helper(val, wt, capacity - wt[n-1], n, dp)),
            helper(val, wt, capacity, n-1, dp));
        }
        else{
            dp[capacity][n] = helper(val, wt, capacity, n-1, dp);
        }
        return dp[capacity][n];
    }
}