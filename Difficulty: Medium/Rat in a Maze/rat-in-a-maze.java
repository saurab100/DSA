class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> output = new ArrayList<>();
        int n = maze.length;
        boolean[][] visited = new boolean[n][n];
        StringBuilder str = new StringBuilder();
        helper(maze, 0, 0, output, visited, n, str);
        return output;
        
    }
    
    public void helper(int[][] maze, int row, int col, ArrayList<String> output, boolean[][] visited, int n, StringBuilder str){
        if(row == n-1 && col == n-1){
            output.add(str.toString());
            return;
        }
        if(col > n-1 || row < 0 || row >= n || col < 0 || maze[row][col] == 0 || visited[row][col] == true) return;
        visited[row][col] = true;
        
        
        
         //DOWN
        if(row+1 < n && maze[row+1][col] == 1 && !visited[row+1][col]){
            str.append("D");
            helper(maze, row+1, col, output, visited, n, str);
            str.deleteCharAt(str.length()-1);
        }
        
         //LEFT
        if(col-1 >= 0 && maze[row][col-1] == 1 && !visited[row][col-1]){
            str.append("L");
            helper(maze, row, col-1, output, visited, n, str);
            str.deleteCharAt(str.length()-1);
        }
        
         //RIGHT
        if(col+1 < n && maze[row][col+1] == 1 && !visited[row][col+1]){
            str.append("R");
            helper(maze, row, col+1, output, visited, n, str);
            str.deleteCharAt(str.length()-1);
        }
        
        //UP
        if(row-1 >= 0 && maze[row-1][col] == 1 && !visited[row-1][col]){
            str.append("U");
            helper(maze, row-1, col, output, visited, n, str);
            str.deleteCharAt(str.length()-1);
        }
        
        visited[row][col] = false;
    }
}