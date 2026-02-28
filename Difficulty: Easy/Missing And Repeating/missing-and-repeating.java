class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        long sum = 0;
        long sq = 0;
        long actualSum = 0;
        long actualSqSum = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            actualSum += arr[i];
            actualSqSum += arr[i]*arr[i];
        }
        
        for(int i = 1; i <= arr.length; i++){
            sum += i;
            sq += i*i;
        }
        
        long missing = 0;
        long repeating = 0;
        long missRepeat = (actualSqSum - sq) / (actualSum - sum);
        repeating = (missRepeat + (actualSum - sum)) / 2;
        missing = missRepeat - repeating;
        list.add((int) repeating);
        list.add((int) missing);
        return list;
    }
}
