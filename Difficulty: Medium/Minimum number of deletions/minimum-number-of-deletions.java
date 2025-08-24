class Solution {
    public int minDeletions(String s) {
       StringBuilder s1 = new StringBuilder();
        for(int i = s.length()-1; i >= 0; i--){
            s1.append(s.charAt(i));
        }
        String rev = s1.toString();
        int m = s.length();
        int n = rev.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return m - lcs(s, rev, m, n, dp);
    }
    
    public int lcs(String s, String rev, int m, int n, int[][] dp){
        if(m == 0 || n == 0){
            return 0;
        }
        if(dp[m][n] != -1){
            return dp[m][n];
        }
        if(s.charAt(m-1) == rev.charAt(n-1)){
            dp[m][n] = 1 + lcs(s, rev, m-1, n-1, dp);
        }
        else{
            dp[m][n] = Math.max(lcs(s, rev, m-1, n, dp), lcs(s, rev, m, n-1, dp));
        }
        return dp[m][n];
        
    }
}