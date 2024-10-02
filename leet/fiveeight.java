package leet;

public class fiveeight {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }

    public static void main(String[] args) {
        String s1 = "   fly me   to   the moon  ";
        System.out.println("Length of last word: " + lengthOfLastWord(s1)); // Output: 4

    }


}
