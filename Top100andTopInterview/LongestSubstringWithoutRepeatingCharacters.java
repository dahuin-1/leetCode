package Top100andTopInterview;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        // Use a HashMap<Character, Integer> if dup is allowed.
        // Limit the size of Set if at most k distinct char allowed.
        Set<Character> memory = new HashSet<>();
        int result = 0;
        // p1 is a pioneer pointer. So p1 <= length.
        for (int p1 = 1, p2 = 0; p1 <= arr.length; p1++) {
            char cur = arr[p1 - 1];
            while (memory.contains(cur)) {
                memory.remove(arr[p2]);
                p2++;
            }
            memory.add(cur);
            result = Math.max(result, p1 - p2);
        }
        return result;
    }
}
