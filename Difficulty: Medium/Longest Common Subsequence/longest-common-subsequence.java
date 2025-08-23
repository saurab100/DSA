class Solution {
    static int lcs(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length(); 
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return helper(s1, s2, m, n, dp);
    }
    
    static int helper(String s1, String s2, int m, int n, int[][] dp){
        if( m == 0 || n == 0){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            dp[m][n] = 1 + helper(s1, s2, m-1, n-1, dp);
        }
        else{
            dp[m][n] = Math.max(helper(s1, s2, m, n-1, dp), helper(s1, s2, m-1, n, dp));
        }
        return dp[m][n];
    }
}