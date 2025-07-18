class Solution {

    public ArrayList<Integer> jobSequencing(int[] deadline, int[] profit) {
        int n = deadline.length;
        int maxSize = Integer.MIN_VALUE;
        for(int i = 0; i < deadline.length; i++){
            if(deadline[i] > maxSize){
                maxSize = deadline[i];
            }
        }
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i] = new int[]{deadline[i], profit[i]};
        }
        Arrays.sort(arr, (a, b) -> Integer.compare(b[1],a[1]));
       
        int[] jobArray = new int[maxSize];
        ArrayList<Integer> result = new ArrayList<>();
        int num = 0;
        int maxProfit = 0;
        boolean[] slot = new boolean[maxSize+1];
        
        //how to fill the jobArray
        for(int i = 0; i < arr.length; i++){
            int d = arr[i][0];
            int p = arr[i][1];
            for(int j = d; j >= 1; j--){
                if(!slot[j]){
                    slot[j] = true;
                    num++;
                    maxProfit += p;
                    break;
                }
            }
        }
        
        result.add(num);
        result.add(maxProfit);
        return result;
    }
}