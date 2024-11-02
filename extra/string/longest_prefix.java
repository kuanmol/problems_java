package extra.string;

public class longest_prefix {
    public static void main(String[] args) {
        longest_prefix longestPrefix = new longest_prefix();
        String[] input = {"geek", "geeks", "geeksfor"};

        System.out.println(longestPrefix.logesest(input));
    }

    public String logesest(String[] s) {
        String prefix = s[0];
        for (int i = 0; i < s.length; i++)
            while (s[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }
}
