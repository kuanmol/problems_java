package leet.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class one {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i =0; i<nums.length; i++){
            int num=nums[i];
            if(map.containsKey(target-num)){

                return new int[] {i, map.get(target-num)};
            }

            map.put(num,i);
        }

        return new int[] {};
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,7,8,9,0,3,5,7};
        int target = 17;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
