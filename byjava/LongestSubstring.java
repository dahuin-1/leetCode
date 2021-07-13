package byjava;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        ls.lengthOfLongestSubstring("pwwkew");
    }

    public int lengthOfLongestSubstring(String s) {
        //s = abc abc bb
        String[] list = new String[s.length()];
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            for (int k = i; k < s.length(); k++) {
                if (!str.toString().contains(String.valueOf(s.charAt(k)))) {
                    str.append(s.charAt(k));
                } else {
                    break;
                }
            }

        list[i] = String.valueOf(str);
        str = new StringBuilder();
    }

        int max = 0;
        for (int i = 0; i < list.length; i++) {
           // System.out.println(list[i].length());
           if(max < list[i].length()) {
               max = list[i].length();
           }
        }
       // System.out.println(max);

        return max;

    }

}
