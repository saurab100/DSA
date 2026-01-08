class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] ans = new int[n];
        ArrayList<Integer> list =  new ArrayList<Integer>();
        
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() && arr[i] >= arr[st.peek()]) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = arr[st.peek()];
            st.push(i);
        }
        for(int i : ans) list.add(i);
        return list;
    }
}