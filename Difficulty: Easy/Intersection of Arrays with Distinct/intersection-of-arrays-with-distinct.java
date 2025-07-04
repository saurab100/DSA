class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < b.length; i++){
            map.put(b[i], 1);
        }
        
        for(int i = 0; i < a.length; i++){
            if(map.containsKey(a[i])){
                count++;
            }
        }
        return count;
    }
}