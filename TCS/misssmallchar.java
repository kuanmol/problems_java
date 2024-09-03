package TCS;

public class misssmallchar {
    public static void main(String[] args) {
        String input = "bbbb";
        char missingChar = smal(input);
        System.out.println("The smallest missing character is: " + missingChar);
    }

    public static char smal(String input) {
        boolean[] present = new boolean[26];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                return (char) (i + 'a');
            }
        }

        return '-';
    }

}
