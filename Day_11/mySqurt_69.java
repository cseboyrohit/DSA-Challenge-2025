class mySqurt_69 {
  public int mySqrt(int x) {
      if (x == 0 || x == 1) return x;

      int left = 1, right = x, ans = 0;

      while (left <= right) {
          int mid = left + (right - left) / 2;
          
          if (mid <= x / mid) { // To prevent overflow, use mid <= x / mid instead of mid * mid <= x
              ans = mid; // Store the last valid mid
              left = mid + 1;
          } else {
              right = mid - 1;
          }
      }
      
      return ans;
  }

  public static void main(String[] args) {
      Solution sol = new Solution();
      System.out.println(sol.mySqrt(4)); // Output: 2
      System.out.println(sol.mySqrt(8)); // Output: 2
  }
}
