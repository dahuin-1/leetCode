package byjava;

import java.util.HashSet;
import java.util.Set;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        lps.longestPalindrome("babcabtad");
    }

    public String longestPalindrome(String s) {
        String[] list = new String[s.length()];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            for (int k = i+1; k < s.length(); k++) {
                stringBuilder.append(s.charAt(k-1));
                if (s.charAt(i) == s.charAt(k)) {
                    stringBuilder.append(s.charAt(k));
                   break;
                }/* else {
                    break;
                }*/
            }
            list[i] = String.valueOf(stringBuilder);
            stringBuilder = new StringBuilder();
        }
        for (String value : list) {
            System.out.println(value);
        }

        return "";
    }

}
