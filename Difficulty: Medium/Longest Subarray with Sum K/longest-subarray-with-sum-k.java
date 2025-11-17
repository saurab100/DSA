// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n = arr.length;
        int prefix = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            prefix += arr[i];
            if(map.containsKey(prefix - k)){
                maxLen = Math.max(maxLen, i - map.get(prefix- k));
            }
            if(!map.containsKey(prefix)){
                map.put(prefix, i);
            }
        }
        return maxLen;
        
    }
}
