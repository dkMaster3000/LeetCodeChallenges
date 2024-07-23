package main;

public class LongestPalindromicSubstring {

    public String longestPalindrome(String s) {

        String safe = "";

        for (int startpoint = 0; startpoint < s.length(); startpoint++) {

            if (s.length() - startpoint <= safe.length()) break;

            for (int endpoint = s.length(); endpoint >= startpoint; endpoint--) {

                if (endpoint - startpoint <= safe.length()) break;

                String substring = s.substring(startpoint, endpoint);

                if (substring.length() >= safe.length()) {
                    if (checkIfPalindrome(substring)) {
                        safe = substring;
                    }
                }
            }
        }


        return safe;
    }


    public boolean checkIfPalindrome(String s) {

        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}


//5. Longest Palindromic Substring
//Given a string s, return the longest palindromic substring in s.
//
//
//Example 1:
//
//Input: s = "babad"
//Output: "bab"
//Explanation: "aba" is also a valid answer.
//        Example 2:
//
//Input: s = "cbbd"
//Output: "bb"