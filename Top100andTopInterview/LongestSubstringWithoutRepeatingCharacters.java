package Top100andTopInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(ls.lengthOfLongestSubstring(""));

    }
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        Map<Character,Integer> map = new HashMap<>();
        List<String > list = new ArrayList<>();
        String result = "";
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                if(list.size() == 0 || list.get(0).length() <= result.length()){
                    list.add(0,result);
                }
                result = "";
                map.clear();
            }
            map.put(s.charAt(i),1);
            result += s.charAt(i);
        }
        if(list.get(0).length() <= result.length()) {
            list.add(0,result);
        }
       /* for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }*/
       // System.out.println(list.get(0));
        //System.out.println(list.get(0).length());
        return list.get(0).length();
    }
}
