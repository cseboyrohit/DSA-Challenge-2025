import java.util.*;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;
        int carry = 0;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];  // Add digit from num
                i--;
            }
            result.add(k % 10);  // Store the last digit
            k /= 10;  // Carry for the next step
        }

        // The result is in reverse order, so we need to reverse it
        Collections.reverse(result);
        return result;
    }
}
