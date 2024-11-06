package leetcode.array;

public class fivefive {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 1, 4};
        System.out.println(canJump(arr));
    }

    private static boolean canJump(int[] nums) {
        int n = nums.length;
        int target = n - 1;

        for (int i = target - 1; i >= 0; i--) {
            if (i + nums[i] >= target) {
                target = i;
            }
        }
        return target == 0;
    }

}
