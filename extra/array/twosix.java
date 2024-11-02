package extra.array;

import java.util.Arrays;

class Solution {
    public static int removeDuplicates(int[] nums) {
        int counter = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[counter] != nums[i]) {
                counter++;
                nums[counter] = nums[i];
            }
        }
        return counter + 1;
    }

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int[] expectedNums = {1, 2};

        int k = removeDuplicates(nums);
        int[] result = Arrays.copyOf(nums, k);
        System.out.println("Output: " + Arrays.toString(result));

        assert Arrays.equals(result, expectedNums);
    }
}

