package leetcode.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class onezerozerotwo {
    public List<String> commonChars(String[] words) {
        List<String> result = new ArrayList<>();

        int[] charCount = new int[26];
        Arrays.fill(charCount, Integer.MAX_VALUE);


        for (String word : words) {
            int[] wordCharCount = new int[26];
            for (char ch : word.toCharArray()) {
                wordCharCount[ch - 'a']++;
            }

            for (int i = 0; i < 26; i++) {
                charCount[i] = Math.min(charCount[i], wordCharCount[i]);
            }
        }

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
        onezerozerotwo o = new onezerozerotwo();
        String[] words = {
                "bella", "label", "roller"
        };
        System.out.println(o.commonChars(words));
    }
}
