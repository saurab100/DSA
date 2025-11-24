class Solution {
    static boolean isValid(int mat[][]) {
        // code here
        int rows = 9;
        int cols = 9;
        
        for(int i = 0; i < rows; i++){
            Set<Integer> rowSet = new HashSet<>();
            for(int j = 0; j < cols; j++){
                int val = mat[i][j];
                if (val == 0) continue;
                if(val < 1 && val > 9) return false;
                if(!rowSet.add(val)) return false;
            }
        }
        
        for(int i = 0; i < cols; i++){
            Set<Integer> colSet = new HashSet<>();
            for(int j = 0; j < rows; j++){
                int val = mat[j][i];
                if (val == 0) continue;
                if(val < 1 && val > 9) return false;
                if(!colSet.add(val)) return false;
            }
        }
        
        for(int i = 0; i < rows; i += 3){
            for(int j = 0; j < cols; j += 3){
                Set<Integer> boxSet = new HashSet<>();
                for(int row = i; row < i+3; row++){
                    for(int col = j; col < j+3; col++){
                        int val = mat[row][col];
                if (val == 0) continue;
                if(val < 1 && val > 9) return false;
                if(!boxSet.add(val)) return false;
                
            }
        }
                
            }
        }
        return true;
    }
}