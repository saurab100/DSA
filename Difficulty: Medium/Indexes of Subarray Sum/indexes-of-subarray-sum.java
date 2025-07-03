
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        int i = 0;
        int j = 0;
        int curr = 0;
        ArrayList<Integer> list = new ArrayList<>();
        
        while(j < arr.length){
            if(curr < target){
                curr += arr[j];
                j++;
            }
            while (curr > target){
                curr = curr - arr[i];
                i++;
            }
            if (curr == target){
                list.add(i+1);
                list.add(j);
                return list;
            }
        }
        list.add(-1);
        return list;
    }
}
