package leetcode.string;

public class twozerofive {

    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false; // If lengths are different, they can't be isomorphic
        }

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS[charS] == 0 && mapT[charT] == 0) {

                mapS[charS] = charT; // Map charS to charT
                mapT[charT] = charS; // Map charT to charS
            } else {
                if (mapS[charS] != charT || mapT[charT] != charS) {
                    return false; // Inconsistent mapping found
                }
            }
        }

        return true; // All mappings are consistent
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add")); // Output: true
    }

}
