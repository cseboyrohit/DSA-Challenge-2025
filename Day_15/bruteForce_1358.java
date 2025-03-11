public class SubstringCount {
    public static int countSubstringsBruteForce(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String sub = s.substring(i, j + 1);
                if (sub.contains("a") && sub.contains("b") && sub.contains("c")) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstringsBruteForce("abcabc")); // Output: 10
    }
}
