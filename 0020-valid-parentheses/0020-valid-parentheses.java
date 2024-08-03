class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length(); i++){
            char bracket = s.charAt(i);
            if(bracket== '('){
                stack.push(')');
            } else if(bracket == '{'){
                stack.push('}');
            } else if(bracket == '['){
                stack.push(']');
            } else if(stack.isEmpty() || stack.pop() !=bracket){
                return false;
            }
        }
        return stack.isEmpty();
    }
}