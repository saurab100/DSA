class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int n = arr.length;
        int[] prefix = new int[n];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                return true;
            }
            
        }
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
            if(prefix[i] == 0){
                return true;
            }
        }
        for(int i = 0; i < n; i++){
            if(map.containsKey(prefix[i])){
                return true;
            }
            else{
                map.put(prefix[i], i);
            }
        }
        return false;
    }
}