package leet.string;

public class onezerofourseven {

    public static String rr(String s) {
        int end = -1;
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (end >= 0 && chars[end] == c) {
                end--;
            } else {
                chars[++end] = c;
            }
        }
        return new String(chars, 0, end + 1);
    }

    public static void main(String[] args) {

        String s1 = "abbaca";

        System.out.println(rr(s1));
    }
}
