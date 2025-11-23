class Solution {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        int n = mat.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int j = 0; j < n; j++){
            list.add(mat[0][j]);
        }
        for(int i = 1; i < n; i++){
            list.add(mat[i][n-1]);
        }
        for(int j = n-2; j >= 0 ; j--){
            list.add(mat[n-1][j]);
        }
        for(int i = n-2; i >= 1; i--){
            list.add(mat[i][0]);
        }
        return list;
    }
}
