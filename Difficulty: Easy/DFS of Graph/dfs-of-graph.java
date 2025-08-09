class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        helper(adj, visited, 0, result);
        return result;
    }
    
    public void helper(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int start, ArrayList<Integer> result ){
        visited[start] = true;
        result.add(start);
        for(int neighbour : adj.get(start)){
            if(!visited[neighbour]){
                helper(adj, visited,neighbour, result);
            }
        }
    }
}