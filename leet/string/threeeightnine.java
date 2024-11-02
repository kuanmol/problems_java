package leet.string;

public class threeeightnine {
    public static void main(String[] args) {
        String s = "abcd", t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
    public static char findTheDifference(String s, String t) {
        int result = 0;

        for (char c : s.toCharArray()) {
            result ^= c;
        }

        for (char c : t.toCharArray()) {
            result ^= c;
        }

        return (char) result;
    }
}
