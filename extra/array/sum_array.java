package extra.array;

import java.util.ArrayList;

public class sum_array {
    static ArrayList<Integer> add_it(int[] arr1, int[] arr2) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int n = arr1.length;
        int m = arr2.length;
        int carry = 0;
        for (int i = n - 1, j = m - 1; i >= 0 || j >= 0 || carry > 0; i--, j--) {
            int sum = (i >= 0 ? arr1[i] : 0) + (j >= 0 ? arr2[j] : 0) + carry;
            carry = sum / 10;
            int digit = sum % 10;
            arrayList.add(0, digit);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 3};

        ArrayList<Integer> result = add_it(arr1, arr2);
        for (int num : result) {
            System.out.print(num);
        }
        System.out.println();
    }
}
