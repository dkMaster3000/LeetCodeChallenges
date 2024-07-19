package main;

import java.util.HashMap;

public class LongestSubstring {

    public int lengthOfLongestSubstring(String s) {

        int length = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex <= rightIndex && rightIndex < s.length()) {

            if (map.containsKey(s.charAt(rightIndex))) {
                leftIndex = Math.max(leftIndex, map.get(s.charAt(rightIndex)) + 1);
            }

            map.put(s.charAt(rightIndex), rightIndex);

            length = Math.max(length, rightIndex - leftIndex + 1);
            rightIndex++;
            
        }

        return length;
    }
}


//Example 1:
//
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Example 2:
//
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.