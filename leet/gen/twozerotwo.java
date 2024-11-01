package leet.gen;

public class twozerotwo {
    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        int slow = sumOfSquaresOfDigits(n);
        int fast = sumOfSquaresOfDigits(slow);
        while (slow != fast) {
            if (slow == 1) return true;
            slow = sumOfSquaresOfDigits(slow);
            fast = sumOfSquaresOfDigits(
                    sumOfSquaresOfDigits(fast));
        }
        return slow == 1;
    }

    public static int sumOfSquaresOfDigits(int n) {
        int ans = 0;
        while (n > 0) {
            int remainder = n % 10;
            ans += remainder * remainder;
            n /= 10;
        }

        return ans;
    }
}
