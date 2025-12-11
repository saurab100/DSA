// User function Template for Java

class Solution {
    public int rowWithMax1s(int arr[][]) {
    
        int rows = arr.length;
        int cols = arr[0].length;
        int right = cols-1;
        int left = 0;
        
        int maxRow = -1;
        
        while(left < rows && right >= 0){
            if(arr[left][right] == 1){
                right--;
                maxRow = left;
            }
            else left++;
        }
        return maxRow;
    }
}