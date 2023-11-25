//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int Arr[]= new int[N];
            for(int i = 0; i < N; i++)
                Arr[i] = Integer.parseInt(input_line[i]);
            int k = Integer.parseInt(read.readLine());
            
            Solution ob = new Solution();
            System.out.println(ob.findSubArraySum(Arr, N, k));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int findSubArraySum(int Arr[], int N, int k)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int preSum = 0;
        map.put(0, 1);
        for(int i =0; i <= N-1; i++){
            preSum += Arr[i];
            if (map.containsKey(preSum - k)){
                count += map.get(preSum-k);
            }
            if(map.containsKey(preSum)) {
                map.put(preSum, map.get(preSum)+1);
            }
            else{
                map.put(preSum, 1);
            }
        }
        return count;
    }
}