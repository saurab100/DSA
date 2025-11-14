class Solution {
    boolean isPalindrome(String s) {
        // code here
        return Palindrome(s, 0, s.length()-1);
    }
    boolean Palindrome(String s, int i, int j){
        if(i >= j ) return true;
        if(s.charAt(i) != s.charAt(j)) return false;
    return Palindrome(s, i+1, j-1);
    }
    
}