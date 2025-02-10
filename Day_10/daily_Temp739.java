  import java.util.*;

  public class daily_Temp739 {
  
      public static int[] dailyTemperatures(int[] temperatures) {
          int n = temperatures.length;
          int[] answer = new int[n];
          Stack<Integer> stack = new Stack<>();
  
          for (int i = 0; i < n; i++) {
              // Process the current temperature
              while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                  int idx = stack.pop();  // Get the index of the previous day
                  answer[idx] = i - idx;  // Calculate the number of days to wait for a warmer temperature
              }
              stack.push(i);  // Push the current day's index onto the stack
          }
  
          return answer;  // Return the result array
      }
  
      public static void main(String[] args) {
          // Test case
          int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
  
          // Sort the temperatures array (this is not required for the original problem, but just as requested)
          Arrays.sort(temperatures);
  
          // Call the method to calculate daily temperatures
          int[] result = dailyTemperatures(temperatures);
  
          // Print the result
          System.out.println("Temperatures: " + Arrays.toString(temperatures));
          System.out.println("Days to wait for a warmer temperature: " + Arrays.toString(result));
      }
  }
  