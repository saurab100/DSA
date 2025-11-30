class Solution {
    public int minRemoval(int intervals[][]) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        int count = 0;
        int[] last = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            if(last[1] <= intervals[i][0]) {
                last[1] = intervals[i][1];
            }
            else {
                last[1] = Math.min(last[1], intervals[i][1]);
                count++;
        }
        }
        return count;
    }
}
