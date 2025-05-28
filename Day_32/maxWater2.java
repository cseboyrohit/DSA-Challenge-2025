public class Main {

    public int maxWater(int arr[]) {
        int left = 0, right = arr.length - 1;
        int res = 0;
        while (left < right) {
            int water = Math.min(arr[left], arr[right]) * (right - left);
            res = Math.max(res, water);

            if (arr[left] < arr[right])
                left += 1;
            else
                right -= 1;
        }
        return res;
    }

    public static void main(String[] args) {
        Main solution = new Main();
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxWater(heights);
        System.out.println("Maximum water that can be trapped: " + result);
    }
}
