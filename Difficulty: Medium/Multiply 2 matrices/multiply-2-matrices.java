class Solution {
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < mat1.length; i++){
            ArrayList<Integer> innerList = new ArrayList<>();
            for(int j = 0; j < mat2[0].length; j++){
                int t = 0;
                for(int k = 0; k < mat1.length; k++){
                    t += mat1[i][k] * mat2[k][j];
                }
                innerList.add(t);
            }
            list.add(innerList);
        }
        
        return list;
    }
}