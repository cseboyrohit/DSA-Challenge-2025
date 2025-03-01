class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int  ans=numBottles;
        while(numBottles >= numExchange) {
           int newBottles= numBottles / numExchange;
           int remBottles= numBottles % numExchange;
           ans=ans+newBottles;
           numBottles=newBottles + remBottles;
        }
        return ans;
    }
  public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.numWaterBottles(9, 3));  // Output: 13
        System.out.println(solution.numWaterBottles(15, 4)); // Output: 19
    }
}
