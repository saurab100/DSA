class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int i = 0;
        int sum = 0;
        int maxSum = 0;
        for(int j = 0; j < arr.length; j++){
            sum += arr[j];
            if(j - i + 1 == k){
                maxSum = Math.max(maxSum, sum);
                sum -= arr[i];
                i++;
            }
        }
        return maxSum;
    }
}