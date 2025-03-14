package leetcode.array;

public class onesevenfivetwo {

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};


        System.out.println(isRotatedSortedArray(nums1)); // true
        System.out.println(isRotatedSortedArray(nums2)); // false
        System.out.println(isRotatedSortedArray(nums3)); // true
    }

    private static boolean isRotatedSortedArray(int[] nums) {
        int countBreaks = 0;
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] > nums[i]) {
                countBreaks++;
                if (countBreaks > 1) {
                    return false;
                }
            }
        }

        return countBreaks != 1 || nums[n - 1] <= nums[0];
    }

}
