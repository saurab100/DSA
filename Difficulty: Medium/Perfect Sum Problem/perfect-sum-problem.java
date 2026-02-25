class Solution {
    // Function to calculate the number of subsets with a given sum
    int[][] dp;
    public int perfectSum(int[] arr, int target) {
        // code here
        int n = arr.length;
        dp = new int[n+1][target+1];
        for(int[] row: dp) Arrays.fill(row, -1);
        return helper(arr, target, n);
    }
     public int helper(int arr[], int target, int n){
        if(n == 0 && target == 0) return 1;
        if(n == 0 && target > 0) return 0;
        if(dp[n][target] != -1) return dp[n][target];
        else if(arr[n-1] <= target){
            dp[n][target] = helper(arr, target - arr[n-1], n-1) + helper(arr, target, n-1);
        }
        else dp[n][target] = helper(arr, target, n-1);
        return dp[n][target];
    }
}