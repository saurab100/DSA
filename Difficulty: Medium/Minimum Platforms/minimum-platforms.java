// User function Template for Java

class Solution {
    // Function to find the minimum number of platforms required at the
    // railway station such that no train waits.
    static int findPlatform(int arr[], int dep[]) {
        int n = arr.length;
        int count = 1;
        int maxCount = 1;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 0;
        int i = 1;
        while(i < n && j < n ){
            if( arr[i] <= dep[j]){
                count++;
                i++;
            }
            else{
                count--;
                j++;
            }
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
