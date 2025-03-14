package leetcode.string;

public class oneninefiveseven {
    public static String makeFancyString(String s) {
        int sameCount = 0;
        StringBuilder sb = new StringBuilder();
        char prev = s.charAt(0);
        for (char cur : s.toCharArray()) {
            if (cur == prev) {
                sameCount++;
            }
            else {
                sameCount = 1;
            }
            if (sameCount < 3) sb.append(cur);
            prev = cur;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s="aaabaaaa";
        System.out.println(makeFancyString(s));
    }
}
