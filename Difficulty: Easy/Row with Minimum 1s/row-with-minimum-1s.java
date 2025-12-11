class Solution {
    int minRow(int mat[][]) {
        // code here
        int rows = mat.length;
        int cols = mat[0].length;
        int minCount = Integer.MAX_VALUE;
        int outIndex = 1;
        
        for(int i = 0; i < rows; i++){
            int count = 0;
            for(int j = 0; j < cols; j++){
                if(mat[i][j] == 1) count++;
            }
            if(count < minCount){
                minCount = count;
                outIndex = i;
            }
        }
        return outIndex+1;
    }
};