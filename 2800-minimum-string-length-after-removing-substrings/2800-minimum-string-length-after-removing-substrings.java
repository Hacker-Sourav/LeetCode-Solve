class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(char curr_char : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(curr_char);
                continue;
            }
            if(curr_char=='B' && stack.peek()=='A' || curr_char=='D' && stack.peek()=='C'){
                stack.pop();
            }
            else{
                stack.push(curr_char);
            }
        }

        return stack.size();
    }
}