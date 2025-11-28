// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
        // code here
        int maxOne = 0;
        int rows = arr.length;
        int cols = arr[0].length;
        int result = -1;
        
        for(int i = 0; i < rows; i++){
            int count = 0;
            for(int j = 0; j < cols; j++){
                if(arr[i][j] == 1) count++;
            }
            if(count > maxOne){
                result = i;
                maxOne = count;
            }
            //maxOne = Math.max(maxOne, count);
        }
        return result;
    }
}