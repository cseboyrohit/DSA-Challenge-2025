import java.util.*;

public class PartitionLabels {
    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int[] lastIndex = new int[26]; // Store last occurrence of each character
        
        // Step 1: Record the last occurrence of each character
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        // Step 2: Partition the string
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            end = Math.max(end, lastIndex[s.charAt(i) - 'a']); // Update end
            
            if (i == end) { // If current index matches end, we found a partition
                result.add(end - start + 1);
                start = i + 1; // Move to next partition
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s)); // Output: [9, 7, 8]
    }
}
