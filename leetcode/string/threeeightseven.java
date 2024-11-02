package leetcode.string;

import java.util.HashMap;

public class threeeightseven {
    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        HashMap<Character, Integer> cc = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            cc.put(c, cc.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (cc.get(s.charAt(i)) == 1) {
                return i;

            }
        }
        return -1;
    }

    public static int first(String s) {
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (charCount[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
