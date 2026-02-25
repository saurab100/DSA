class Solution {
    static int[][] dp;
    public static int minSuperSeq(String s1, String s2) {
        // code here
        int m = s1.length();
        int n = s2.length();
        dp = new int[m+1][n+1];
        for(int[] d : dp) Arrays.fill(d, -1);
        return m+n-helper(s1, s2, m, n);
    }
    
    static int helper(String s1, String s2, int m, int n){
        if(m == 0 || n == 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
        else if(s1.charAt(m-1) == s2.charAt(n-1)){
            dp[m][n] = 1 + helper(s1, s2, m-1, n-1);
        }
        else dp[m][n] = Math.max(helper(s1, s2, m-1, n), helper(s1, s2, m, n-1));
        return dp[m][n];
    }
}