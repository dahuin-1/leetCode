package byjava;

import java.util.HashMap;
import java.util.HashSet;

public class ValidParentheses {


    public static void main(String[] args) {
       ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("(]"));

    }

    public boolean isValid(String s) {
        HashMap<String, String> map = new HashMap<>();
        map.put("(", ")");
        map.put("[", "]");
        map.put("{", "}");

        for(int i = 0; i < s.length(); i++){
           // if(!s.contains(map.get(String.valueOf(s.charAt(i))))){
                if(!map.containsKey(String.valueOf(s.charAt(i)))||!map.containsValue(String.valueOf(s.charAt(i)))){
                return false;
            }
            int max = Math.max(s.indexOf(map.get(String.valueOf(s.charAt(i)))) ,i);
            int min = Math.min(s.indexOf(map.get(String.valueOf(s.charAt(i)))) ,i);
            int temp = (max - min) -1;
            System.out.println(temp);

           if(temp %2 != 0){
              return false;
            }
        }
        return true;
    }
}

