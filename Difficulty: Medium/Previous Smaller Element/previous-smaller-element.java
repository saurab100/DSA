class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        // code here
        int n = arr.length;
    int[] ans = new int[n];
    Arrays.fill(ans,-1);
    Deque<Integer> st = new ArrayDeque<>();
    for(int i = 0; i < n; i++){
        while(!st.isEmpty() && arr[st.peekFirst()] >= arr[i]){
            st.pollFirst();
        }
        if(!st.isEmpty()) ans[i] = arr[st.peekFirst()];
        st.offerFirst(i);
    }
    ArrayList<Integer> list = new ArrayList<>();
    for(int num : ans) list.add(num);
    return list;
    }
}