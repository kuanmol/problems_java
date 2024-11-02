package extra.TCS;

public class oneone {
    public static void main(String[] args) {
        String word = "aaabbaccccdd";
        int sum = 0;
        int count = 1;
        for (int i = 1; i <= word.length(); i++) {
            if (i < word.length() && word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                if (count % 2 == 0) {
                    sum += count;
                }
                count = 1;
            }
        }
        System.out.println(sum);
    }
}
