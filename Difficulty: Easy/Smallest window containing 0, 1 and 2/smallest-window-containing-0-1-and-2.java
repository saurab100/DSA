// User function Template for Java

class Solution {
    public int smallestSubstring(String s) {
        // Code here
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        int minLen = Integer.MAX_VALUE;
        
        for(int j = 0; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))) map.put(s.charAt(j), map.get(s.charAt(j)) + 1);
            else map.put(s.charAt(j), 1);
            while(map.size() == 3){
                minLen = Math.min(minLen, j -i + 1);
                map.put(s.charAt(i), map.get(s.charAt(i)) - 1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
        }
        if(minLen == Integer.MAX_VALUE) return -1;
        else return minLen;
    }
};
