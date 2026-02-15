class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        int i = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(i < n){
            while(i+1 < n && arr[i] == arr[i+1]) i++;
            list.add(arr[i]);
            i++;
        }
        return list;
    }
}
