class Solution {
    public ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int top = 0;
        int left = 0;
        int bottom = rows-1;
        int right = cols-1;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(left <= right && top <= bottom){
            for(int j = left; j <= right; j++){
                list.add(mat[top][j]);
            }
            for(int i = top+1; i <= bottom; i++){
                list.add(mat[i][right]);
            }
            if(top < bottom){
            for(int j = right-1; j >= left; j--){
                list.add(mat[bottom][j]);
            }
            }
            if(left < right){
            for(int i = bottom-1; i >= top+1; i--){
                list.add(mat[i][left]);
            }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return list;
    }
}
