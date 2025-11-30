class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
       ArrayList<int[]> list = new ArrayList<>();
        list.add(arr[0]);
        //System.out.println(list);
        for(int i = 1; i < arr.length; i++) {
            int[] last = list.get(list.size() - 1);
            if ( last[1] >= arr[i][0]) {
                    last[1] = Math.max(last[1], arr[i][1]);
            } else {
                list.add(new int[] {arr[i][0], arr[i][1]});
            }
        }
        return list ;
    }
}