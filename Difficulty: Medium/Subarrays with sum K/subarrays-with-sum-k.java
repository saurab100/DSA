class Solution {
    public int cntSubarrays(int[] arr, int k) {
        // code here
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int prefix = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            prefix += arr[i];
            //System.out.println(prefix - k);
            if(map.containsKey(prefix - k)) count += map.get(prefix - k);
            if(map.containsKey(prefix)) map.put(prefix, map.get(prefix) + 1);
            else map.put(prefix, 1);
        }
        return count;
    }
}