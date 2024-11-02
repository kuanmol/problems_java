package extra.string;

public class shuffle_String {
    static String mixing(String s, int[] index) {
        int count = 0;
        char[] arr = new char[index.length];
        for (int i = 0; i < index.length; i++) {
            arr[index[i]] = s.charAt(i);
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "codeleet";
        int[] index = {4, 5, 6, 7, 0, 2, 1, 3};
        String ans = mixing(s, index);
        System.out.println(ans);
    }
}
