class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) prefix[i] = prefix[i-1] + arr[i];
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(map.containsKey(prefix[i] - k)){
                count += map.get(prefix[i] - k);
            }
            if(!map.containsKey(prefix[i])) map.put(prefix[i], 1);
            else map.put(prefix[i], map.get(prefix[i])+1);
        }
        return count;
    }
}