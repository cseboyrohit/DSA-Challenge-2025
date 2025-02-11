public class removeAllOcc_1910 {

  public String removeOccurrences(String s, String part) {
    // Loop until 'part' is not found in 's'
    while (s.contains(part)) {
        // Find the index of the leftmost occurrence of 'part'
        s = s.replaceFirst(part, "");
    }
    return s;
}

public static void main(String[] args) {
  removeAllOcc_1910  solution = new removeAllOcc_1910 ();

    // Test case 1
    String s1 = "daabcbaabcbc";
    String part1 = "abc";
    System.out.println(solution.removeOccurrences(s1, part1)); // Output: "dab"

    // Test case 2
    String s2 = "axxxxyyyyb";
    String part2 = "xy";
    System.out.println(solution.removeOccurrences(s2, part2)); // Output: "ab"
}
}