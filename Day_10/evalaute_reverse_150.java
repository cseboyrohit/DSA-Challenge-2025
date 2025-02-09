import java.util.*;
public class evalaute_reverse_150 {
  public static int evalRPN(String[] tokens) { 
      Stack<Integer> st = new Stack<>();
      for (String c : tokens) {
          if (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
              int second = st.pop();
              int first = st.pop();
             
              switch (c) {
                  case "+":
                      st.push(first + second);
                      break;
                  case "-":
                      st.push(first - second);
                      break;
                  case "*":
                      st.push(first * second);
                      break; 
                  case "/":
                      st.push(first / second);
                      break; 
              }
          } else {
              st.push(Integer.parseInt(c));
          }
      }
      return st.pop();
  }

  public static void main(String[] args) {
      // Test example: ["2", "1", "+", "3", "*"]
      String[] tokens = {"2", "1", "+", "3", "*"};
      System.out.println(evalRPN(tokens)); // Expected output: 9

      // Another test case: ["4", "13", "5", "/", "+"]
      String[] tokens2 = {"4", "13", "5", "/", "+"};
      System.out.println(evalRPN(tokens2)); // Expected output: 6

      // A case with more complex operations: ["10", "6", "9", "3", "/", "-", "*"]
      String[] tokens3 = {"10", "6", "9", "3", "/", "-", "*"};
      System.out.println(evalRPN(tokens3)); // Expected output: 30
  }
}
