package leetcode.string;

public class sixninesix {

    public static int countBinarySubstrings(String s) {
        int length = s.length();
        int count = 0;
        int curr = 1;  // Count the current group size
        int prev = 0;  // Count the previous group size

        for (int i = 1; i < length; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                curr++;
            } else {
                count += Math.min(prev, curr);
                prev = curr;
                curr = 1;
            }
        }

        count += Math.min(prev, curr);

        return count;   
    }

    public static void main(String[] args) {

        String s1 = "00110011";
        System.out.println("Count: " + countBinarySubstrings(s1));  // Output: 6

    }
}

