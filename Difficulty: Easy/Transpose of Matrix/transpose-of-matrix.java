class Solution {
    public ArrayList<ArrayList<Integer>> transpose(int[][] mat) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        int col = mat[0].length;
        int row = mat.length;
        for(int j = 0; j < mat[0].length; j++){
            ArrayList<Integer> list2 = new ArrayList<>();
            for(int i = 0; i < mat.length; i++){
                list2.add(mat[i][j]);
            }
            list.add(list2);
        }
        return list;
    }
}