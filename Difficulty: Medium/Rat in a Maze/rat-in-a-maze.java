class Solution {
    public ArrayList<String> ratInMaze(int[][] maze) {
        StringBuilder str = new StringBuilder();
        int n = maze.length;
        
        boolean[][] visited = new boolean[n][n];
        ArrayList<String> list = new ArrayList<>();
        if (maze[0][0] == 0) return list;
        helper(maze, 0, 0, n, visited, str, list);
        return list;
    }
    
    public void helper(int[][] maze, int r, int c, int n,
                       boolean[][] visited,
                       StringBuilder str,
                       ArrayList<String> list) {

        // Base case: destination
        if (r == n - 1 && c == n - 1) {
            list.add(str.toString());
            return;
        }

        visited[r][c] = true;

        // Down
        if (r + 1 < n && maze[r + 1][c] == 1 && !visited[r + 1][c]) {
            str.append('D');
            helper(maze, r + 1, c, n, visited, str, list);
            str.deleteCharAt(str.length() - 1);
        }
        
         // Left
        if (c - 1 >= 0 && maze[r][c - 1] == 1 && !visited[r][c - 1]) {
            str.append('L');
            helper(maze, r, c - 1, n, visited, str, list);
            str.deleteCharAt(str.length() - 1);
        }

       
        // Right
        if (c + 1 < n && maze[r][c + 1] == 1 && !visited[r][c + 1]) {
            str.append('R');
            helper(maze, r, c + 1, n, visited, str, list);
            str.deleteCharAt(str.length() - 1);
        }
        
         // Up
        if (r - 1 >= 0 && maze[r - 1][c] == 1 && !visited[r - 1][c]) {
            str.append('U');
            helper(maze, r - 1, c, n, visited, str, list);
            str.deleteCharAt(str.length() - 1);
        }

        // Backtrack
        visited[r][c] = false;
    }
}