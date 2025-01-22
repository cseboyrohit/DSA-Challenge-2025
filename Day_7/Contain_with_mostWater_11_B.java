public class Contain_with_mostWater_11_B {
  public static int MaxArea(int[] height) {
    int maxArea =0;
    for(int i=0; i<height.length; i++) {
      for(int j=i+1; j<height.length; j++){
        int width= j-1;
        int minHeight = Math.min(height[i],height[j]);
        int area= width * minHeight;
        maxArea = Math.max(area , maxArea);
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    int[] height = {1,8,6,2,5,4,8,3,7};
    System.out.println(MaxArea(height));
  }
}
