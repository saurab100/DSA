class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ArrayList<Integer> list =  new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i] = i+1;
            else ans[i] = i - st.peek();
            st.push(i);
        }
        for(int i : ans) list.add(i);
        return list;
    }
}