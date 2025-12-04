// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int prefixSum = 0;
        int longestSubarray = 0;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0; i < n; i++){
            prefixSum  += arr[i];
            if(map.containsKey(prefixSum - k)) longestSubarray = Math.max(longestSubarray, i - map.get(prefixSum-k));
            if(!map.containsKey(prefixSum)) map.put(prefixSum, i);
        }
        return longestSubarray;
    }
}
