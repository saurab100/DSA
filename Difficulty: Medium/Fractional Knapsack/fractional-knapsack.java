class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        // code here
        int n = val.length;
        double[][] arr = new double[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = val[i];
            arr[i][1] = wt[i];
        }
        double profit = 0.0;
        Arrays.sort(arr, (a,b) -> Double.compare(b[0]/b[1], a[0]/a[1]));
        for(int i = 0; i < n && capacity > 0; i++){
            if(arr[i][1] <= capacity){
                capacity -= arr[i][1];
                profit += arr[i][0];
            }
            else{
                profit += (capacity/arr[i][1]) * arr[i][0];
                break;
            }
        }
        return profit;
    }
}