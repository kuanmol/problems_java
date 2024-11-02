package leetcode.dp;

import java.util.ArrayList;
import java.util.List;

public class oneoneeight {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
