package leetcode.string;

import java.util.*;

public class onezztwo {

    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        // Initialize the charCount extra.array to hold the maximum possible value
        int[] charCount = new int[26];
        Arrays.fill(charCount, Integer.MAX_VALUE);

        // Iterate over each word
        for (String word : words) {
            // Initialize a temporary count extra.array for the current word
            int[] wordCharCount = new int[26];
            for (char ch : word.toCharArray()) {
                wordCharCount[ch - 'a']++;
            }

            // Update the global charCount extra.array to the minimum counts
            for (int i = 0; i < 26; i++) {
                charCount[i] = Math.min(charCount[i], wordCharCount[i]);
            }
        }

        // Construct the result list from the charCount extra.array
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            if (charCount[i] > 0) {
                for (int count = 0; count < charCount[i]; count++) {
                    result.add(String.valueOf(ch));
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        onezztwo solution = new onezztwo();
        String[] words = {"bella", "label", "roller"};
        List<String> commonCharacters = solution.commonChars(words);
        System.out.println(commonCharacters); // Output: ["e", "l", "l"]
    }
}


