package leetcode.string;

public class threeonethreesix {
    public static void main(String[] args) {
        System.out.println(isValidWord("234Adas")); // true
        System.out.println(isValidWord("b3"));      // false
        System.out.println(isValidWord("a3$e"));    // false
    }

    public static boolean isValidWord(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        for (char c : word.toCharArray()) {

            if (!Character.isLetterOrDigit(c)) {
                return false;
            }

            if (Character.isLetter(c)) {
                if (isVowel(c)) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

