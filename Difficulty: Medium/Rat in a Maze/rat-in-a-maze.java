class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<String>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        StringBuilder str = new StringBuilder();
        backtrack(maze, 0, 0, n, str, visited, result);
        return result;
    }
    
    public void backtrack(int[][] maze, int row, int col,  int n, StringBuilder str, boolean[][] visited, ArrayList<String> result){
        if(row == n-1 && col == n-1){
            result.add(str.toString());
            return;
        }
        if(row < 0 || row >= n || col < 0 || col >= n) return;
        if(maze[row][col] == 0 || visited[row][col]) return;
        
        visited[row][col] = true;
       
        //Down
        str.append("D");
        backtrack(maze, row+1, col,  n, str, visited, result);
        str.deleteCharAt(str.length()-1);
        
         //left
        str.append("L");
        backtrack(maze, row, col-1,  n, str, visited, result);
        str.deleteCharAt(str.length()-1);
        
         //Right
        str.append("R");
        backtrack(maze, row, col + 1,  n, str, visited, result);
        str.deleteCharAt(str.length()-1);
        
         //Up
        str.append("U");
        backtrack(maze, row-1, col,  n, str, visited, result);
        str.deleteCharAt(str.length()-1);
        
        visited[row][col] = false;
        
        
    }
}