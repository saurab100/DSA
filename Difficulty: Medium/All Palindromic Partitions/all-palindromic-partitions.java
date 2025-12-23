class Solution {
    public ArrayList<ArrayList<String>> palinParts(String s) {
        ArrayList<ArrayList<String>> finalPartition = new ArrayList<>();
        ArrayList<String> currentPartition = new ArrayList<>();
        helper(s, 0, currentPartition, finalPartition);
        return finalPartition;
    }
    
    public void helper(String s, int index, ArrayList<String> currentPartition, ArrayList<ArrayList<String>> finalPartition){
        if(index == s.length()){
            finalPartition.add(new ArrayList<>(currentPartition));
            return;
        }
        for(int i = index; i < s.length(); i++){
            String sub = s.substring(index, i+1);
    
        //System.out.println(sub);
        if(!validPalindrome(sub)) continue;
        currentPartition.add(sub);
        helper(s, i + 1, currentPartition, finalPartition);
        currentPartition.remove(currentPartition.size()-1);
        }

    }
    
    public boolean validPalindrome(String sub){
        int left = 0;
        int right = sub.length()-1;
        while(left < right){
            if(sub.charAt(left) != sub.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
