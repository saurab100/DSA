// User function Template for Java

class Solution {
    // Function to count the number of subarrays with a sum that is divisible by K
    public int subCount(int[] arr, int k) {
        // code here
        int n = arr.length;
        long prefixSum = 0;   // <-- change to long

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int count = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += arr[i];

            int rem = (int)((prefixSum % k + k) % k);

            count += map.getOrDefault(rem, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}
