class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = arr[i] + prefix[i-1];
        }
        int leftSum = 0;
        int rightSum = 0;
        for(int i = 0; i < n; i++){
            leftSum = prefix[i];
            rightSum = prefix[n-1] - prefix[i];
            if(leftSum == rightSum){
                return true;
            }
        }
        return false;
    }
}