class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        boolean[] visited = new boolean[V];
        boolean[] pathVisited = new boolean[V];
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
        }
        for(int i = 0; i < V; i++){
            if(!visited[i]){
                if(dfs(adj, i, visited, pathVisited)){
                    return true;
                }
            }
        }
        
        return false;
    }
    
    public boolean dfs(ArrayList<ArrayList<Integer>> adj,int node, boolean[] visited,boolean[] pathVisited ){
        visited[node] = true;
        pathVisited[node] = true;
        for(int neighbour : adj.get(node)){
            if(!visited[neighbour]){
                if(dfs(adj, neighbour, visited, pathVisited)){
                    return true;
                }
            }
                else if(pathVisited[neighbour]){
                    return true;
                }
            
            }
            pathVisited[node] = false;
            return false;
        }
        
}