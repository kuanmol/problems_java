package leetcode.dp;

public class onefivetwo {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, -2, 4};
        int[] nums2 = {-2, 0, -1};

        System.out.println(maxProduct(nums1)); // Output: 6
        System.out.println(maxProduct(nums2)); // Output: 0
    }

    public static int maxProduct(int[] nums) {
        if (nums == null || nums.length == 0) return 0;

        int maxProductSoFar = nums[0];
        int minProductSoFar = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            int tempMax = Math.max(current, Math.max(maxProductSoFar * current, minProductSoFar * current));
            minProductSoFar = Math.min(current, Math.min(maxProductSoFar * current, minProductSoFar * current));
            maxProductSoFar = tempMax;

            result = Math.max(result, maxProductSoFar);
        }

        return result;
    }

}
