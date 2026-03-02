class Solution {
    public int countSubstr(String s, int k) {
        //  code here
        Map<Character, Integer> map = new HashMap<>();
        return atmost(k, s, map) - atmost(k-1, s, map);
    }
    
    public int atmost(int k, String s, Map<Character, Integer> map){
        int i = 0;
        int count = 0;
        for(int j = 0; j < s.length(); j++){
            if(map.containsKey(s.charAt(j))) map.put(s.charAt(j), map.get(s.charAt(j))+1);
            else map.put(s.charAt(j), 1);
            while(map.size() > k){
                map.put(s.charAt(i), map.get(s.charAt(i))-1);
                if(map.get(s.charAt(i)) == 0) map.remove(s.charAt(i));
                i++;
            }
            count += j - i + 1;
        }
        map.clear();
        return count;
    }
}