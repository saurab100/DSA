class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            if(!st.isEmpty()) result[i] = i - st.peek();
            else result[i] = i+1;
            
            st.add(i);
        }
        for(int i : result) list.add(i);
        
        return list;
    }
}