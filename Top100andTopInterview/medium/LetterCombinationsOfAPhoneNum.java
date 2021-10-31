package Top100andTopInterview.medium;

import java.util.*;

public class LetterCombinationsOfAPhoneNum {

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNum lcp = new LetterCombinationsOfAPhoneNum();
        System.out.println(lcp.letterCombinations("23"));
    }

    public List<String> letterCombinations(String digits) {

       /* Map<Integer, List<String>> map = new HashMap<>();
        map.put(2, Arrays.asList("a", "b", "c"));
        map.put(3, Arrays.asList("d", "e", "f"));
        map.put(4, Arrays.asList("g", "h", "i"));
        map.put(5, Arrays.asList("j", "k", "l"));
        map.put(6, Arrays.asList("m", "n", "o"));
        map.put(7, Arrays.asList("p", "q", "r", "s"));
        map.put(8, Arrays.asList("t", "u", "v"));
        map.put(9, Arrays.asList("w", "x", "y", "z"));
        if (digits.length() == 1) {
            return map.get(Integer.parseInt(digits));
        }*/
        LinkedList<String> ans = new LinkedList<String>();
        if(digits.isEmpty()) return ans;
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        ans.add("");
        /////
        for(int i = 0; i < digits.length(); i++){
            int x = Character.getNumericValue(digits.charAt(i));
            while(ans.peek().length()==i){
                String t = ans.remove();
                for(char s : mapping[x].toCharArray())
                    ans.add(t+s);
            }
        }
        //// 이부분 손코딩 해보기
        return ans;
    }

    }
