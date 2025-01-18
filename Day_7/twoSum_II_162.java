// 167. Two Sum II - Input Array Is Sorted
public class twoSum_II_162 {
  public static int[] twoSumSorted(int[] arr, int target){
    int left=0;
    int right=arr.length-1;
    int sum =0;
    while(left < right) {
      sum = arr[left] + arr[right];
      if(sum == target){
        return new int[]{left+1, right+1};
      }else if(sum < target){
        left++;
      }else
        right--;
    }
    return null;
  }
  public static void main(String[] args) {
    int[] num = {2, 7, 11, 15};
    int[] result = twoSumSorted(num, 9);
    
    if (result != null) {
      System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    } else {
      System.out.println("No solution found");
    }
  }
}
