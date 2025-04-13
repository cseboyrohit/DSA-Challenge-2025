import java.util.*;

class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int sum2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int allSum = sum1 + sum2 + carry;
            result.append(allSum % 10);
            carry = allSum / 10;

            i--;
            j--;
        }

        return result.reverse().toString();
    }

    // ✅ Main method to test the function
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        String num1 = sc.nextLine();
        
        System.out.print("Enter second number: ");
        String num2 = sc.nextLine();
        
        Solution solution = new Solution();
        String result = solution.addStrings(num1, num2);
        
        System.out.println("Sum: " + result);
    }
}
