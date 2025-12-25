/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Pair {
    Node node;
    int x;

    Pair(Node node, int x){
        this.node = node;
        this.x = x;
    }
}
class Solution {
    public ArrayList<Integer> topView(Node root) {
        // code here
       Queue<Pair> q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        int x = 0;
        if (root == null) return list;
        q.add(new Pair(root, x));
        Map<Integer, Node> map = new TreeMap<>();
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair p1 = q.poll();
                Node node = p1.node;
                x = p1.x;
                if (!map.containsKey(x)) map.put(x, node);
                if(node.left != null) q.add(new Pair(node.left, x-1));
                if(node.right != null) q.add(new Pair(node.right, x+1));
            }
        }
        for(Map.Entry<Integer, Node> m : map.entrySet()){
            list.add(m.getValue().data);
        }
        return list;
    }
}