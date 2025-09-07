class Solution {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefixSum = new int[n];
        int result = 0;
        prefixSum[0] = arr[0];
        for(int i = 1; i < n ; i++){
            prefixSum[i] = arr[i] + prefixSum[i-1];
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 1; i < n; i++){
            
            leftSum = prefixSum[i];
            rightSum = prefixSum[n-1] - prefixSum[i-1];
            if(leftSum == rightSum){
                return i;
            }
        }
        return -1;
    }
}
