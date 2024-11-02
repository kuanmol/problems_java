package leetcode.array;

import java.util.HashMap;
import java.util.Map;

public class onethreeseven {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
