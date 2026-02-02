class Solution {
    public static int findEquilibrium(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) prefix[i] += prefix[i-1] + arr[i];
        //System.out.println(Arrays.toString(prefix));
        for(int i = 0; i < n; i++){
            if(i == 0){
                if(prefix[i] == prefix[n-1]) return i;}
            else if(prefix[i] == prefix[n-1]-prefix[i-1]) return i;
        }
        return -1;
    }
}
