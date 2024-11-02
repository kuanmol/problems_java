package extra.string;

public class max_word_in_sentence {

    static int count_the_word(String[] sentences) {
        int max = 0;
        for (int i = 0; i < sentences.length; i++) {
            String sentence = sentences[i];
            String[] words = sentence.split(" ");
            int wordcount = words.length;
            if (wordcount > max) {
                max = wordcount;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        max_word_in_sentence max_word_in_sentence = new max_word_in_sentence();
        String[] sentences = {"alice and bob love leetcode",
                "i think so too",
                "this is great thanks very much"};
        int ans = count_the_word(sentences);
        System.out.println(ans);
    }
}
