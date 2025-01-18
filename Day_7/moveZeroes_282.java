
public class moveZeroes_282 {
  public static void MoveZero(int[] nums){
    int pointer=0;
    for(int i=0; i < nums.length; i++) {
      if(nums[i] != 0){
      nums[pointer] = nums[i];
      pointer++;
      }
    }
    for(int i=pointer; i<nums.length; i++){
      nums[i] = 0;
    }
  }
  public static void main(String[] args) {
    int[] nums = {0,1,0,3,12};
    MoveZero(nums);
    for(int num : nums){
      System.out.print(num + " ");
    }
  }
}
