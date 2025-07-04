class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        int i = 0;
        int n = arr.length;
        for(int j = 1; j < n; j++){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }
}