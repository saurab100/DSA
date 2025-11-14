class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;
        list.add(getMin(arr, n));
        list.add(getMax(arr, n));
        return list;
    }
    
    public int getMin(int[] arr, int n){
        if(n == 1) return arr[0];
        return Math.min(arr[n-1], getMin(arr, n-1));
    }
    
     public int getMax(int[] arr, int n){
        if(n == 1) return arr[0];
        return Math.max(arr[n-1], getMax(arr, n-1));
    }
    
}
