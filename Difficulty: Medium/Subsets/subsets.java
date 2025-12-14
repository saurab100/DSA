class Solution {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
         helper(arr, 0, inner, outer);
         return outer;
        
    }
    
    public void helper(int arr[], int start, ArrayList<Integer> inner, ArrayList<ArrayList<Integer>> outer){
        outer.add(new ArrayList<>(inner));
        for(int i = start; i < arr.length; i++){
        inner.add(arr[i]);
        helper(arr, i+1, inner, outer);
        inner.remove(inner.size()-1);
        }
    }
}