package extra.string;

public class max_of_Stringpair {
    static int find_number(String[] word) {
        int maxpair = 0;
        for (int i = 0; i < word.length; i++) {
            for (int j = i + 1; j < word.length; j++) {
                if (word[i].charAt(0) == word[j].charAt(1)
                        && word[i].charAt(1) == word[j].charAt(0)) {
                    maxpair++;
                }
            }
        }
        return maxpair;
    }

    public static void main(String[] args) {
        String[] words = {"cd", "ac", "dc", "ca", "zz"};
        int ans = find_number(words);
        System.out.println(ans);
    }
}
