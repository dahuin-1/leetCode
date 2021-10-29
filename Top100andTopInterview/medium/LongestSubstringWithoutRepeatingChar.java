package Top100andTopInterview.medium;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {

    public int lengthOfLongestSubstring(String s) {
       int result = 0;
       char[] arr = s.toCharArray();
       Set<Character> set = new HashSet<>();
       for (int p1 = 1, p2 = 0; p1 <= s.length(); p1++){
           char current = arr[p1-1];
           if(set.contains(current)){
               set.remove(arr[p2]);
               p2++;
           }
           set.add(current);
           result = Math.max(result, p1-p2);
       }
        return result;
    }

}
