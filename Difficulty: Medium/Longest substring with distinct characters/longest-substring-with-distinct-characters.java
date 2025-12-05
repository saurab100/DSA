class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int longestUniqueSubstring = 0;
        int i = 0; int j = 0;
        while(j < s.length()){
            if(map.containsKey(s.charAt(j))) map.put(s.charAt(j), map.get(s.charAt(j))+1);
            else map.put(s.charAt(j), 1);
            if(map.size() == j-i+1) longestUniqueSubstring = Math.max(longestUniqueSubstring, j-i+1);
            else if(map.size() < j-i+1){
                while(map.size() < j-i+1){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
            }
            j++;
        }
        return longestUniqueSubstring;
    }
}