class Solution {
    int[][] dp;
    public int cutRod(int[] price) {
        // code here
        int n = price.length;
        int rodLength = n;
        dp = new int[n+1][rodLength+1];
        for(int[] arr : dp) Arrays.fill(arr, -1);
        return helper(price, rodLength, n);
    }
    
    public int helper(int val[], int rodLength, int n){
        if(rodLength == 0 || n == 0) return 0;
        
        if(dp[n][rodLength] != -1) return dp[n][rodLength];
        if(n <= rodLength){
            dp[n][rodLength] =  Math.max(val[n-1] + helper(val, rodLength - n, n), helper(val, rodLength, n-1));
        }
        else dp[n][rodLength] =  helper(val, rodLength, n-1);
        return dp[n][rodLength];
    }
}