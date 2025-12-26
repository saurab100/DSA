/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Pair {
    Node node;
    int col;

    Pair(Node node, int col){
        this.node = node;
        this.col = col;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        Queue<Pair> q = new LinkedList<>();
        ArrayList<ArrayList<Integer>> output = new ArrayList<>();
        if(root == null) return output;
        int col = 0;
        q.add(new Pair(root, col));
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i = 0; i < size; i++){
                Pair p = q.poll();
                Node node = p.node;
                col = p.col;
                if(!map.containsKey(col)) map.put(col, new ArrayList<>());
                map.get(col).add(node.data);
                if(node.left != null) q.add(new Pair(node.left, col-1));
                if(node.right != null) q.add(new Pair(node.right, col+1));
            }

        }
        for(Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()){
           ArrayList<Integer> list= m.getValue();
           //Collections.sort(list);
           output.add(list);
        }

        return output;
    
    }
}