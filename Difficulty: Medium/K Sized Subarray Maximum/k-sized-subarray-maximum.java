class Solution {
    public ArrayList<Integer> maxOfSubarrays(int[] nums, int k) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] arr = new int[n - k + 1];
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            while(!dq.isEmpty() && dq.peekFirst() < i - k + 1) dq.pollFirst();
            dq.addLast(i);

            if(i >= k -1){
                arr[i - k + 1] = nums[dq.peekFirst()];
            }
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++) list.add(arr[i]);
        return list;
    }
}