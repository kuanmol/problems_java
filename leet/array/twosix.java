package leet.array;

public class twosix {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4};
        twosix solution = new twosix();
        int k = solution.removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (k == 0 || nums[k - 1] != nums[i]) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}
