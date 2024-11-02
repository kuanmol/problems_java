package leetcode.string;

public class threeeight {

    public static String countAndSay(int n) {
        if (n == 1) return "1";

        StringBuilder result = new StringBuilder();
        String prev = countAndSay(n - 1);
        int count = 1;
        char say = prev.charAt(0);

        for (int i = 1; i < prev.length(); i++) {
            if (prev.charAt(i) != say) {
                result.append(count).append(say);
                count = 1;
                say = prev.charAt(i);
            } else {
                count++;
            }
        }

        result.append(count).append(say);
        return result.toString();

    }

    public static void main(String[] args) {

        System.out.println("n = 111, Output: " + countAndSay(11)); // Output: "1211"

    }

}
