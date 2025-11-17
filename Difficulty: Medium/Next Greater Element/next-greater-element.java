class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
    int n = arr.length;
    int[] ans = new int[n];
    Arrays.fill(ans,-1);
    Deque<Integer> st = new ArrayDeque<>();
    for(int i = n-1; i >= 0; i--){
        while(!st.isEmpty() && arr[st.peekFirst()] <= arr[i]){
            st.pollFirst();
        }
        if(!st.isEmpty()) ans[i] = arr[st.peekFirst()];
        st.push(i);
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int num : ans) list.add(num);
    return list;
    }
}