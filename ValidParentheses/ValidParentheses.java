package ValidParentheses;
import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(map.containsKey(c)){
                if(!stack.empty()){
                    if(map.get(c) != stack.pop()){
                        return false;
                    }
                }else{
                    return false;
                }
            }else{
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
