class Solution {
    public int maxProduct(int[] nums) {
        int secondMax= -1;
        int max=-1;
        for(int i=0; i<nums.length; i++) {
            if(max < nums[i]) {
                secondMax=max;
                max=nums[i];
            } else if(secondMax <= nums[i]){
                secondMax= nums[i];
            }
        }
            int ans= (secondMax-1) * (max -1);
            return ans;
    }
}

// ............................................................................
import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        return (nums[n]-1) * (nums[n-1]-1);
        
    }
}
