
import java.util.*;

class Solution {
    public int countSymmetricIntegers(int low, int high) {
         int count = 0;

         for(int num = low; num <= high; num++) {  // <= is important
            String s = Integer.toString(num);
            int n = s.length();

            if(n % 2 != 0) continue;  // skip odd length

            int mid = n / 2;
            int leftSum = 0;
            int rightSum = 0;

            for(int i = 0; i < mid; i++) {
                leftSum += s.charAt(i) - '0';
            }
            for(int i = mid; i < n; i++) {
                rightSum += s.charAt(i) - '0';
            }

            if(leftSum == rightSum) {
                count++;
            }
         }

         return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter low: ");
        int low = sc.nextInt();

        System.out.print("Enter high: ");
        int high = sc.nextInt();

        Solution sol = new Solution();
        int ans = sol.countSymmetricIntegers(low, high);

        System.out.println("Count of Symmetric Integers = " + ans);
    }
}
