class Solution {
    static Boolean[][] d;
    static boolean equalPartition(int arr[]) {
        // code here
        int n = arr.length;
        int sum = 0;
        for(int i : arr) sum+=i;
        d = new Boolean[n+1][sum+1];
        if(sum %2 != 0) return false;
        return helper(arr, sum/2, n);
    }
    
    static boolean helper(int arr[], int sum, int n){
        if(sum == 0) return true;
        if(n == 0 && sum > 0) return false;
        if(d[n][sum] != null) return d[n][sum];
        else if(arr[n-1] <= sum){
            d[n][sum] =  helper(arr, sum -arr[n-1], n-1) || helper(arr, sum, n-1);
        }
        else d[n][sum] = helper(arr, sum, n-1);
        return d[n][sum];
    }
}