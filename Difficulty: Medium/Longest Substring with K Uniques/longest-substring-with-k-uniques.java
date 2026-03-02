class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        Map<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxLen = 0;
        
        for(int j = 0; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))) map.put(s.charAt(j), map.get(s.charAt(j))+1);
            else map.put(s.charAt(j), 1);
            if(map.size() == k) maxLen = Math.max(maxLen, j - i + 1);
            else if(map.size() > k){
                while(map.size() > k){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                    i++;
                }
            }
        }
        if(maxLen == 0) return -1;
        else return maxLen;
    }

}