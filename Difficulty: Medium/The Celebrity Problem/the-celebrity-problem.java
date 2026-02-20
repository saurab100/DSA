class Solution {
    public int celebrity(int mat[][]) {
        
        int n = mat.length;
        int candidate = 0;
        
        for(int i = 1; i < n; i++){
            if(knows(mat, candidate, i)) candidate = i;
        }
        
        for(int i = 0; i < n; i++){
            if(candidate != i && mat[candidate][i] != 0) return -1;
            else if(candidate != i && mat[i][candidate] != 1) return -1;
        }
        return candidate;
        
    }
    
    boolean knows(int mat[][], int a, int b){
        if(mat[a][b] == 1) return true;
        else return false;
    }
}