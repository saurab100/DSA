class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int j = 0;
        int currSum = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            if(i -j + 1 == k){
                maxSum = Math.max(maxSum, currSum);
                currSum = currSum - arr[j];
                j++;
            }
        }
        return maxSum;
    }
}