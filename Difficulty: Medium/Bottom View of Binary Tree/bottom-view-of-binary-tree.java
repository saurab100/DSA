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
class Pair{
    Node node;
    int x;
    
    Pair(Node node, int x){
        this.x = x;
        this.node = node;
    }
}
class Solution {
    public ArrayList<Integer> bottomView(Node root) {
        // code here
        Queue<Pair> q = new ArrayDeque<>();
        if(root == null) return new ArrayList<>();
        q.offer(new Pair(root, 0));
        ArrayList<Integer> list = new ArrayList<Integer>();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while(!q.isEmpty()){
            
            int size = q.size();
            for(int i = 0; i < size; i++){
                Pair pair = q.poll();
                Node node = pair.node;
                int x = pair.x;
                map.put(x, node.data);
                
                if(node.left != null) q.offer(new Pair(node.left, x-1));
                if(node.right != null) q.offer(new Pair(node.right, x+1));
            }
        }
        for(Map.Entry<Integer, Integer> m : map.entrySet()){
            list.add(m.getValue());
        }
        return list;
    }
}