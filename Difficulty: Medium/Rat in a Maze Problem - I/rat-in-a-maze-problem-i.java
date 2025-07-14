class Solution {
    // Function to find all possible paths
    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder path = new StringBuilder();
        int n = maze.length; 
        boolean[][] visited = new boolean[n][n];
        helper(0, 0, maze, path, result, visited);
        return result;
    }
    
    public void helper(int i, int j,int[][] maze,  StringBuilder path, ArrayList<String> result, boolean[][] visited ){
        int n = maze.length; 
        if( i == n-1 && j == n -1){
            result.add(path.toString());
            return;
        }   
        visited[i][j] = true;
        int[] di = {1,0,0,-1};
        int[] dj = {0,-1,1,0};
        char[] dir = {'D','L', 'R', 'U'};
        
        for(int d = 0; d < 4; d++){
            int nextI = i + di[d];
            int nextJ = j + dj[d];
            
            if ( nextI >= 0 && nextI < n && nextJ >= 0 && nextJ < n && maze[nextI][nextJ] == 1 && !visited[nextI][nextJ]){
                path.append(dir[d]);
                helper(nextI, nextJ, maze, path, result, visited);
                path.deleteCharAt(path.length() - 1);
                
            }
        }
        visited[i][j] = false;
                           
    }
}