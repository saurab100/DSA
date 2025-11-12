// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int prefix = 0;
        int maxLen = 0;
        map.put(0,-1);
        for(int i = 0; i < n; i++){
            prefix += arr[i];
            if(map.containsKey(prefix - k)){
                maxLen = Math.max(maxLen, i - map.get(prefix-k));
            }
            if(!map.containsKey(prefix)){
                map.put(prefix , i);
            }
        }
        return maxLen;
    }
}
