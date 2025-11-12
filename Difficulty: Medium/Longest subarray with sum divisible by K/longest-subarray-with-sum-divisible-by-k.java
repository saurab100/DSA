// User function Template for Java

class Solution {
    int longestSubarrayDivK(int[] arr, int k) {
        // Complete the function
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        long prefix = 0L;
        int maxLen = 0;
        map.put(0,-1);
        for(int i = 0; i < n; i++){
            prefix += arr[i];
            int div = (int) (prefix % k + k) %k;
            if(map.containsKey(div)){
                maxLen = Math.max(maxLen, i - map.get(div));
            }
            else {
                map.put(div , i);
            }
        }
        return maxLen;
    }
}
