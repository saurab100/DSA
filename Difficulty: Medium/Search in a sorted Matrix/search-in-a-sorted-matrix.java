class Solution {
    public boolean searchMatrix(int[][] mat, int x) {
        // code here
        int left = 0;
        int right = mat[0].length-1;
        
        while(left < mat.length && right >= 0){
            if(mat[left][right] < x) left++;
            else if (mat[left][right] > x) right--;
            else return true;
        }
        return false;
    }
}
