class Solution {
    public int celebrity(int mat[][]) {
        int x = 0;
        int j = mat.length - 1;
        int candidate = 0;
        while(x < j){
            if(knows(x, j, mat)) x++;
            else if(!knows(x, j, mat)) j--;
        }
        candidate = x;
        
        for(int i = 0; i < mat[0].length; i++){
            if( i != candidate && mat[candidate][i] != 0) return -1;
        }
        
        for(int i = 0; i < mat.length; i++){
            if( i != candidate && mat[i][candidate] != 1) return -1;
        }
        return candidate;
        
    }
    
    public boolean knows(int a, int b, int mat[][]){
        if(mat[a][b] != 1) return false;
        else return true;
    }
}