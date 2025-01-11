package leetcode.array;

public class onethreesix {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }
}
