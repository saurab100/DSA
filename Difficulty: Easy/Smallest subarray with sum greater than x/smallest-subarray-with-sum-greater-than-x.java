// User function Template for Java

class Solution {

    public static int smallestSubWithSum(int x, int[] arr) {
        int curr = 0;
        int j = 0;
        int i = 0;
        int minLen = Integer.MAX_VALUE;
        int n = arr.length;
        
        while(i < n && j < n){
            curr += arr[j];
            //System.out.println("curr outside:" + curr);
            while(curr > x){
                //System.out.println("curr inside:" + curr);
                minLen = Math.min(minLen, j-i+1);
                curr = curr - arr[i];
                i++;
            }
            if(curr <= x) j++;
        }
        if(minLen == Integer.MAX_VALUE) return 0;
        else return minLen;
    }
}
