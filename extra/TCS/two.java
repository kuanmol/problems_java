package extra.TCS;

public class two {
    public static void main(String[] args) {
        String str = "abcdc";
        String result = palindrome(str);
        System.out.println(result);
    }

    public static String palindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        int n = input.length();

        for (int i = 0; i < n; i++) {
            if (input.startsWith(reversed.substring(i))) {
                return reversed.substring(0, i);
            }
        }
        return reversed;
    }
}
