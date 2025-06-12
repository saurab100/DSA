// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> list3 = new ArrayList<>();
        Set<String> seen = new HashSet<>();
       int l = 0; int r = arr.length-1;
       while(l < r){
           if(arr[l] + arr[r] == 0){
               ArrayList<Integer> list4 = new ArrayList<>();
               list4.add(arr[l]);
               list4.add(arr[r]);
               String unique = arr[l] +":"+arr[r];
               if(!seen.contains(unique)){
                   list3.add(list4);
                   seen.add(unique);
               }
               l++;
               r--;
           }
           else if(arr[l] + arr[r] < 0){
               l++;
           }
           else{
               r--;
           }
       }
       return list3;
    }
}
