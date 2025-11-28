class Solution {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        int left = 0;
        int right = n-1;
        
        while(left < right){
            if(mat[left][right] == 1) left++;
            else right --;
        }
        int cand = left;
        //System.out.println(right);
        for(int i = 0; i < n; i++){
            if(i == cand) continue;
            if(mat[cand][i] != 0) return -1;
        }
        for(int i = 0; i < n; i++){
            if(i == cand) continue;
            if(mat[i][cand] != 1) return -1;
        }
        return cand;
    }
}