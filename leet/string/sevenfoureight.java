package leet.string;

class ShortestCompletingWord {
    public static String shortestCompletingWord(String licensePlate, String[] words) {
        String cleanedPlate = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int[] plateCount = getLetterCount(cleanedPlate);

        String result = null;
        for (String word : words) {
            if (isCompletingWord(word, plateCount)) {
                if (result == null || word.length() < result.length()) {
                    result = word;
                }
            }
        }
        return result;
    }

    // Check if a word is a completing word
    private static boolean isCompletingWord(String word, int[] plateCount) {
        int[] wordCount = getLetterCount(word.toLowerCase());
        for (int i = 0; i < 26; i++) {
            if (wordCount[i] < plateCount[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper function to get the letter count (frequency) of a string
    private static int[] getLetterCount(String str) {
        int[] count = new int[26]; // 26 letters in the alphabet
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                count[c - 'a']++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // Example 1
        String licensePlate1 = "1s3 PSt";
        String[] words1 = {"step", "steps", "stripe", "stepple"};
        System.out.println(shortestCompletingWord(licensePlate1, words1)); // Output: "steps"

        // Example 2
        String licensePlate2 = "1s3 456";
        String[] words2 = {"looks", "pest", "stew", "show"};
        System.out.println(shortestCompletingWord(licensePlate2, words2)); // Output: "pest"
    }
}
