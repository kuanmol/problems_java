package leetcode.gen;

class sixnine {
    public static void main(String[] args) {
        sixnine solution = new sixnine();

        int x1 = 4;
        System.out.println("Input: x = " + x1);
        System.out.println("Output: " + solution.mySqrt(x1));
    }

    public int mySqrt(int x) {
        if (x < 2) return x;

        int left = 1, right = x / 2;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            long square = (long) mid * mid;

            if (square == x) return mid;
            if (square < x) left = mid + 1;
            else right = mid - 1;
        }

        return right;
    }
}

