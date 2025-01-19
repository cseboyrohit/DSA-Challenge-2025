public class bruteForce_162 {
  public static int[] twoSum(int[] nums, int target){
    int[] value= new int[2];
    for(int i=0; i< nums.length; i++){
      for(int j=i+1; j<nums.length; j++){
        if(nums[i]+nums[j] == target){
          value[0] = i+1;
          value[1]=j+1;
        }
      }
    }
    return value;
  }
  public static void main(String[] args) {
    int[] num = {2, 70, 11, 15};
    int[] result = twoSum(num, 9);
    
    if (result != null) {
      System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    } 
  }
}
