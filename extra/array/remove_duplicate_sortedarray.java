package extra.array;

public class remove_duplicate_sortedarray {
    static public int removedup(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                arr[++j] = arr[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,1 ,2 ,3 ,4 ,5};
        int ans = removedup(arr);
        System.out.println(ans);
    }
}
