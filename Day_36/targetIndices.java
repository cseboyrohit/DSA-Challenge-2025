class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Array.sort(nums);
        ArrayList<Integer> index= new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(num[i]== target){
              index.add(i);
            }
        }
        return index;

    }
}
