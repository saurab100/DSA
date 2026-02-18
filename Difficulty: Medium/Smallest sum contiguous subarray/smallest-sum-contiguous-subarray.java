// User function Template for Java

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int minSum = Integer.MAX_VALUE;
        int currSum = 0;
        for(int i = 0; i < size; i++){
            currSum = Math.min(currSum + a[i], a[i]);
            minSum = Math.min(minSum, currSum);
        }
        return minSum;
    }
}