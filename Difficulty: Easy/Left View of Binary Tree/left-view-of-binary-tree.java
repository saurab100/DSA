/*
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}*/
class Solution {
    ArrayList<Integer> leftView(Node root) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        helper(root, 0, result);
        return result;
    }
    
    public void helper(Node root, int newLevel, ArrayList<Integer> result){
        if(root == null){
            return;
        }
        if(result.size() == newLevel){
            result.add(root.data);
        }
        helper(root.left, newLevel + 1, result);
        helper(root.right, newLevel + 1, result);
    }
}