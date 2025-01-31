import java.util.*;

public class validParentheses_20 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // If it's a closing bracket
            if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) return false; // If the stack is empty, no matching opening bracket
                char top = stack.pop(); // Pop the top element from the stack
                // Check if the popped element matches the corresponding opening bracket
                if (c == ')' && top != '(' || 
                    c == '}' && top != '{' || 
                    c == ']' && top != '[') {
                    return false; // Mismatched brackets
                }
            } else {
                // If it's an opening bracket, push it onto the stack
                stack.push(c);
            }
        }
        
        return stack.isEmpty(); // If the stack is empty, all opening brackets have been matched
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(isValid("()"));         // true
        System.out.println(isValid("()[]{}"));     // true
        System.out.println(isValid("(]"));         // false
        System.out.println(isValid("([])"));       // true
    }
}
