import java.util.Stack;

class evalaute_150 {
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (c.equals("-")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first - second);
            } else if (c.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (c.equals("/")) {
                int second = stack.pop();
                int first = stack.pop();
                stack.push(first / second);
            } else {
                stack.push(Integer.parseInt(c));
            }
        }

        return stack.peek();        
    }

    public static void main(String[] args) {
        // Test case 1: "2 1 + 3 *"
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        System.out.println(evalRPN(tokens1)); // Output: 9
        
        // Test case 2: "4 13 5 / +"
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(tokens2)); // Output: 6
        
        // Test case 3: "10 6 9 3 / - *"
        String[] tokens3 = {"10", "6", "9", "3", "/", "-", "*"};
        System.out.println(evalRPN(tokens3)); // Output: 30
    }
}
