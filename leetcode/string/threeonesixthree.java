package leetcode.string;

public class threeonesixthree {
    public static String compressString(String word) {
        StringBuilder comp = new StringBuilder();
        int i = 0;

        while (i < word.length()) {
            char currentChar = word.charAt(i);
            int count = 0;

            while (i < word.length() && word.charAt(i) == currentChar && count < 9) {
                count++;
                i++;
            }

            comp.append(count).append(currentChar);
        }

        return comp.toString();
    }

    public static void main(String[] args) {

        System.out.println(compressString("aaaaaaaaaaaaaabb")); // Output: "9a5a2b"
    }


}
