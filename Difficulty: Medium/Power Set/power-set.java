// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        List<String> result = new ArrayList<>();
        String str = "";
        helper(s, 0, str, result);
        Collections.sort(result);
        return result;
    }
    
    public void helper(String s, int i, String str, List<String> result){
            if(i == s.length()){
                if(!str.isEmpty()){
                    result.add(str);
                }
                return;
            }
            helper(s, i+1, str + s.charAt(i), result);
            helper(s, i+1, str, result);
        
    }
}