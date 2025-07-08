class Solution {

    void printNos(int N) {
        // code here
        if(N == 1){
            System.out.print(N+" ");
            return;
        }
        
        System.out.print(N+" ");
        //Recursive function
        printNos(N - 1);
        
        //Print the numbers
        
        
        return;
    }
}