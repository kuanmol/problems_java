package leetcode.array;

public class fouronefour {
    public static void main(String[] args) {
        //int[] nums={3,2,1};
        int[] nums = {4, 5, 2, 1, 4, 6};
        System.out.println(thirdMax(nums));
    }

    private static int thirdMax(int[] nums) {
        long mx = Long.MIN_VALUE;
        long m2 = Long.MIN_VALUE;
        long m3 = Long.MIN_VALUE;
        for (int i : nums) {
            if (i > mx) {
                m3 = m2;
                m2 = mx;
                mx = i;
            } else if (i > m2 && i != mx) {
                m3 = m2;
                m2 = i;
            } else if (i > m3 && i != mx && i != m2)
                m3 = i;
        }
        return m3 == Long.MIN_VALUE ? (int) mx : (int) m3;
    }
}
