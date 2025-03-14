package leetcode.string;

public class threeninetwo {
    public static boolean isSubsequence(String s, String t) {
        char[] arr = s.toCharArray();
        int i = 0;
        for (char tc : t.toCharArray()) {
            if (i < arr.length && arr[i] == tc) {
                i++;
            }
        }
        return i == arr.length;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
