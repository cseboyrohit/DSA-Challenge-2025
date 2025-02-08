import java.util.*;
class MinStack {
  private Stack<Integer>stack;
  private Stack<Integer>minStack;
  public MinStack() {
      stack=new Stack<>();
      minStack=new Stack<>();
      
  }
  
  public void push(int val) {
     stack.push(val);
       // Push to minStack if it is empty or val is smaller or equal to the top of minStack
     if(minStack.isEmpty() || val <= minStack.peek()){
      minStack.push(val);
     }
  }
  
  public void pop() {
      int top= stack.pop();
      if(top == minStack.peek()){
          minStack.pop();
      }
      
  }
  
  public int top() {
    return stack.peek();
      
  }
  
  public int getMin() {
      return  minStack.peek();
  }
}
public class minStack_155 {
  public static void main(String[]args){
    MinStack minStack = new MinStack();
     // Push values
     minStack.push(-2);
     minStack.push(0);
     minStack.push(-3);
     System.out.println(minStack.getMin()); // returns -3

     minStack.pop();

     // Print the top element
     System.out.println(minStack.top()); // returns 0

     // Print the minimum value
     System.out.println(minStack.getMin()); // returns -2
  }
}
