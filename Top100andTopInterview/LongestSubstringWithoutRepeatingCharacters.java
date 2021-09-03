package Top100andTopInterview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters ls = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(ls.lengthOfLongestSubstring("au"));

    }
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        if(s.isBlank()||s.length()==1){
            return 1;
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
            list.add(0,result);
        }
        if(list.size()==0){
            list.add(0, result);
        }
        else if (list.get(0).length() <= result.length()) {
            list.add(0, result);
        }
        return list.get(0).length();
    }
}
