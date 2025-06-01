import java.util.Arrays;

public class ProductArrayPuzzle {
    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];

        // Step 1: Create prefix product array
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // Step 2: Create suffix product array and calculate result
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = prefix[i] * suffix;
            suffix *= arr[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 3, 5, 6, 2};
        int[] res = productExceptSelf(arr);
        System.out.println("Output: " + Arrays.toString(res));
    }
}
