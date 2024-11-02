package leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threenine {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) {
            return;
        } else if (remain == 0) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(list, tempList, candidates, remain - candidates[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        threenine solution = new threenine();
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        System.out.println("Combinations that sum up to " + target + ": " + result);
    }
}
