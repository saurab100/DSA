class Solution {
    public String reverse(String S) {
        // code here
        Stack<Character> stack = new Stack<>();
        StringBuilder newStr = new StringBuilder();
        for(char c : S.toCharArray()){
            stack.push(c);
        }
        while(!stack.isEmpty()){
            newStr.append(stack.pop());
        }
        return newStr.toString();
    }
}