class Solution {
    public boolean canSplit(int arr[]) {
        // code here
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i < n; i++) prefix[i] += prefix[i-1] + arr[i];
        //System.out.println(Arrays.toString(prefix));
        for(int i = 0; i < n; i++){
            /*if(i == 0){
                if(prefix[i] == prefix[n-1] -prefix[i]) return true;}
            else*/ if(prefix[i] == prefix[n-1]-prefix[i]) return true;
        }
        return false;
    }
}