class Solution {
    public void printNos(int n) {
        // Code here
       if(n == 1){
            System.out.print(n+" ");
            return;
        }
        
        //Recursive function
        printNos(n - 1);
        
        //Print the numbers
        System.out.print(n+" ");
        
        return;
    }
}
