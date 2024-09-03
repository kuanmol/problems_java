package string;

public class index_first_occurance {
    static int check(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        } else if (haystack.indexOf(needle) == 0) {
            return 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        index_first_occurance indexFirstOccurance = new index_first_occurance();
        String a = "leetcode";
        String b = "leeto";
        int ans = check(a, b);
        System.out.println(ans);
    }
}
