class Solution {
    // Function to find the maximum number of meetings that can
    // be performed in a meeting room.
    public int maxMeetings(int start[], int end[]) {
        // add your code here
        int n = start.length;
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = start[i];
            arr[i][1] = end[i];
        }
        int count = 1;
        int i = 0;
        Arrays.sort(arr, (a,b) -> Integer.compare(a[1], b[1]));
        for(int j = 1; j < n; j++){
            if(arr[i][1] >= arr[j][0]) continue;
            else{
                count++;
                i = j;
            }
        }
        //if(count == 1) return 0;
        return count;
        
    }
}
