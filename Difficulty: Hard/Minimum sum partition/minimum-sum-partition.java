// User function Template for Java

class Solution {

    public int minDifference(int arr[]) {
        int n = arr.length;
        int total = 0;
        for(int i = 0; i < n; i++){
            total += arr[i];
        }
        int[][] dp = new int[n+1][total + 1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= total; j++){
                dp[i][j] = -1;
            }
        }
        return total - 2 * helper(arr, n, total/2, dp);
    }
    
    public int helper(int arr[], int n, int total, int[][] dp){
        if( total == 0 || n == 0){
            return 0;
        }
        if(dp[n][total] != -1){
            return dp[n][total];
        }
        int subsetSum = 0;
        if(arr[n-1] <= total){
            dp[n][total] = Math.max(arr[n-1] + helper(arr, n -1, total - arr[n-1], dp ),helper(arr, n-1, total, dp));
        }
        else{
            dp[n][total] =  helper(arr, n-1, total, dp);
        }
        return dp[n][total];
    }
}
