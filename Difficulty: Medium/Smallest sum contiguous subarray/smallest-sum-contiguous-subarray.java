// User function Template for Java

class Solution {
    static int smallestSumSubarray(int a[], int size) {
        int currSum = a[0];
        int minSum = a[0];
        for(int i = 1; i < a.length; i++){
            currSum = Math.min(currSum + a[i], a[i]);
            minSum = Math.min(minSum, currSum);
        }
        return minSum;
    }
}