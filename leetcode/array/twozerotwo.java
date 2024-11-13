package leetcode.array;

public class twozerotwo {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int f = sqsum(n);
        int s = sqsum(f);
        while (f != s) {
            if (f == 1)
                return true;
            f = sqsum(f);
            s = sqsum(sqsum(s));
        }
        return f == 1;
    }

    public static int sqsum(int n) {
        int ans = 0;
        while (n > 0) {
            int remainder = n % 10;
            ans += remainder * remainder;
            n /= 10;
        }

        return ans;
    }
}
