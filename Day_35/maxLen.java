import java.util.HashMap;

public class Solution {
    
    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++) {
            // Convert 0s to -1 to find equal 0s and 1
            sum += (arr[i] == 0) ? -1 : 1;

            if (sum == 0) {
                res = i + 1;
            }

            if (map.containsKey(sum)) {
                res = Math.max(res, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1, 0, 0};
        int result = maxLen(arr);
        System.out.println("Length of longest subarray: " + result);
    }
}
