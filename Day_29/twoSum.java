import java.util.HashSet;

public class Main {

    static boolean twoSum(int[] arr, int target) {
        // Create a HashSet to store the elements
        HashSet<Integer> set = new HashSet<>();

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement that added to arr[i] equals the target
            int complement = target - arr[i];

            // Check if the complement exists in the set
            if (set.contains(complement)) {
                return true;
            }

            // Add the current element to the set
            set.add(arr[i]);
        }
        // If no pair is found
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        boolean result = twoSum(numbers, target);

        if (result) {
            System.out.println("Pair found that adds up to the target.");
        } else {
            System.out.println("No pair found that adds up to the target.");
        }
    }
}
