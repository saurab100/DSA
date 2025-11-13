class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        int i = 0;
        int j = 0;
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (j < n) {
            if (map.containsKey(arr[j])) {
                map.put(arr[j], map.get(arr[j]) + 1);
            } else {
                map.put(arr[j], 1);
            }
            //System.out.println("map before window: " +map);

           if(j - i + 1 == k){
               list.add(map.size());
               map.put(arr[i], map.get(arr[i]) - 1);
               if(map.get(arr[i]) == 0) map.remove(arr[i]);
               i++;
               //System.out.println("map after i++: " +map);
           }
            j++;
        }
        return list;
    }
}