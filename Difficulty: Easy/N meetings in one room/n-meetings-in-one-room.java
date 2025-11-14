class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        if(n==0) return 0;
        int count = 1;
        int[][] arr = new int[n][2];
        for(int i = 0; i<n; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        Arrays.sort(arr, (a, b) -> a[1]-b[1]);
        int lastEnd = arr[0][1];
        //System.out.println(Arrays.deepToString(arr));
        for(int i = 1; i < n; i++){
            if(arr[i][0] > lastEnd){
              count++;
              lastEnd = arr[i][1];
            } 
        }
        return count;
    }
}
