class Solution {
    public ArrayList<ArrayList<Integer>> nQueen(int n) {
        ArrayList<ArrayList<Integer>> outer = new ArrayList<>();
        ArrayList<Integer> inner = new ArrayList<>();
        boolean[] currCol = new boolean[n];
        boolean[] leftD = new boolean[2*n-1];
        boolean[] rightD = new boolean[2*n-1];
        helper(n, 0, currCol, leftD, rightD, inner, outer);
        return outer;
    }
    
    public void helper(int n, int row, boolean[] currCol, boolean[] leftD, boolean[] rightD, 
    ArrayList<Integer> inner, ArrayList<ArrayList<Integer>> outer){
        if(inner.size() == n){
            outer.add(new ArrayList<>(inner));
            return;
        }
        for(int col = 0; col < n; col++){
            int ld = row+col;
            int rd = row-col+n-1;
            if(!currCol[col] && !leftD[ld] && !rightD[rd]){
                
            currCol[col] = true; 
            leftD[ld] = true;
            rightD[rd] = true;
            inner.add(col+1);
            helper(n, row+1, currCol, leftD, rightD, inner, outer);
            inner.remove(inner.size()-1);
            currCol[col] = false; 
            leftD[ld] = false;
            rightD[rd] = false;
            }
        }
    }
}