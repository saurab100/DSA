class Solution {
    public int minPlatform(int arr[], int dep[]) {
        //  code here
        int count = 0;
        int minPlatformsNeeded = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        int j = 0;
        int i = 0;
        while(i < arr.length && j < arr.length){
            if(arr[i] <= dep[j]){
              count++;
              i++;
            } 
            else if(arr[i] > dep[j]){
                    count--;
                    j++;
            } 
            minPlatformsNeeded = Math.max(minPlatformsNeeded, count);
        }
        return minPlatformsNeeded;
    }
}
