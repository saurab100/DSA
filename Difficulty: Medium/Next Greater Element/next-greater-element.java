class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] result = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = n-1; i >=0; i--){
            while(!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            if(!st.isEmpty()) result[i] = arr[st.peek()];
            else result[i] = -1;
            
            st.add(i);
        }
        for(int i : result) list.add(i);
        
        return list;
    }
}