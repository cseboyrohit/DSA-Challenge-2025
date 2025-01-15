import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map to store groups of anagrams
        Map<String, List<String>> anagramGroups = new HashMap<>();
        
        // Loop through all the strings
        for (String str : strs) {
            // Convert the string to a char array, sort it and convert it back to a string
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedStr = new String(chars);
            
            // If the sorted string is already a key in the map, add the original string to the corresponding list
            if (!anagramGroups.containsKey(sortedStr)) {
                anagramGroups.put(sortedStr, new ArrayList<>());
            }
            anagramGroups.get(sortedStr).add(str);
        }
        
        // Return the values (grouped anagrams) as a list of lists
        return new ArrayList<>(anagramGroups.values());
    }

    public static void main(String[] args) {
        GroupAnagrams solution = new GroupAnagrams();
        
        // Example input
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        
        // Get the grouped anagrams
        List<List<String>> result = solution.groupAnagrams(strs);
        
        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
