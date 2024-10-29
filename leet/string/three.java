package leet.string;

import java.util.HashMap;

public class three {

    public static void main(String[] args) {
        String s1 = "abcbcbb";

        System.out.println(lengthOfLongestSubstring(s1)); // Output: 3

    }

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) return 0;

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);

            if (charIndexMap.containsKey(currentChar) && charIndexMap.get(currentChar) >= left) {

                left = charIndexMap.get(currentChar) + 1;
            }
            charIndexMap.put(currentChar, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
