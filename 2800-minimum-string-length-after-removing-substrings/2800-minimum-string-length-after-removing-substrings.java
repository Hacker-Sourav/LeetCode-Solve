class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){

            char curr_char=s.charAt(i);

            if(stack.isEmpty()){
                stack.push(curr_char);
                continue;
            }
            if(curr_char=='B' && stack.peek()=='A'){
                stack.pop();
            }
            else if(curr_char=='D' && stack.peek()=='C'){
                stack.pop();
            }
            else{
                stack.push(curr_char);
            }
        }

        return stack.size();
    }
}