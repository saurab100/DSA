class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int[][] dp = new int[arr.length+1][sum+1];
        for(int i = 0; i <= arr.length; i++){
            for(int j = 0; j <= sum; j++){
                dp[i][j] = -1;
            }
        }
        return helper(arr, sum, arr.length, dp);
    }
    
    static Boolean helper(int arr[], int sum, int n, int[][] dp){
        
        if(sum == 0){
            return true;
        }
        if(n == 0 ){;
            return false;
        }
        if(dp[n][sum] != -1){
            return dp[n][sum] == 1;
        }
        boolean result;
        if(arr[n-1] <= sum){
             result = (helper(arr, sum-arr[n-1], n-1, dp)  || helper(arr, sum, n-1, dp)) ;
        }
        else{
             result = helper(arr, sum, n-1, dp);
        }
        dp[n][sum] = result ? 1 : 0;
        return result;
    } 
}