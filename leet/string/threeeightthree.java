package leet.string;

public class threeeightthree {
    public static void main(String[] args) {
        String ransomNote = "ab", magazine = "abb";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] check = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, check[c % 26]);
            if (index < 0)
                return false;
            check[c % 26] = index + 1;
        }
        return true;
    }
}
