public class Contain_with_mostWater_11 {
  public static int maxArea(int[] height) {
    int left = 0, right = height.length - 1;
    int maxArea = 0;

    while (left < right) {
        // Calculate the area formed by the lines at 'left' and 'right'
        int width = right - left;
        int minHeight = Math.min(height[left], height[right]);
        int area = width * minHeight;
        
        // Update the maxArea if we found a larger area
        maxArea = Math.max(maxArea, area);

        // Move the pointer for the shorter line inward
        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return maxArea;
}

public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxArea(height));  // Output: 49
}
}