class solve {
    // Function to find all possible unique subsets.
    public static ArrayList<ArrayList<Integer>> AllSubsets(int arr[], int n) {
        ArrayList<ArrayList<Integer>> outer =  new ArrayList<>();
        ArrayList<Integer> inner =  new ArrayList<>();
        Arrays.sort(arr);
        helper(arr, 0, inner, outer);
        //Collections.sort(outer);
        return outer;
    }
    
    public static void helper(int arr[], int start, ArrayList<Integer> inner, ArrayList<ArrayList<Integer>> outer){
        outer.add(new ArrayList<>(inner));
        for(int i = start; i < arr.length; i++){
            if(i > start && arr[i] == arr[i-1]){
                continue;
            }
        inner.add(arr[i]);
        helper(arr, i+1, inner, outer);
        inner.remove(inner.size() - 1);
        }
            
    }
}
