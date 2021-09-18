package Top100andTopInterview;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        ls.lengthOfLongestSubstring("abbcde");
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        int length = 0;
        int start = -1;
        int i = 0;
        for(i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                int newStart = map.get(c);
                start = Math.max(start,newStart);
            }
            length = Math.max(length,i-start);
            map.put(c,i);


        }
        return length;
    }
}
