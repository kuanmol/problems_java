package extra.string;

public class mix_max_word {
    static void legnthword(String input) {
        String word = "", small = "", large = "";
        String[] words = new String[100];
        int length = 0;

        input = input + " ";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                word = word + input.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }
        small = large = words[0];
        for (int i = 0; i < length; i++) {
            if (small.length() > words[i].length())
                small = words[i];
            if (large.length() < words[i].length())
                large = words[i];

        }
        System.out.println(small);
        System.out.println(large);
    }

    public static void main(String[] args) {
        String a = "anmol is godman";
        legnthword(a);
    }
}
