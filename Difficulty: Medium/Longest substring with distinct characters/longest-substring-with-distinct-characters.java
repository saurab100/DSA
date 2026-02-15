class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxLen = 0;
        
        for(int j = 0; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))) map.put(s.charAt(j), map.get(s.charAt(j))+1);
            else map.put(s.charAt(j), 1);
            if(map.size() >= j-i+1) maxLen = Math.max(maxLen, j - i + 1);
            else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return maxLen;
    }
}