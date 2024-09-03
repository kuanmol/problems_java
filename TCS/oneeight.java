package TCS;

import java.util.Scanner;

public class oneeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString ="apple";// scanner.nextLine();

        String sortingKey = "eapl";//scanner.nextLine();

        scanner.close();

        int[] charCount = new int[26];
        for (char ch : inputString.toCharArray()) {
            charCount[ch - 'a']++;
        }

        StringBuilder sortedString = new StringBuilder();
        for (char keyChar : sortingKey.toCharArray()) {
            int count = charCount[keyChar - 'a'];
            for (int i = 0; i < count; i++) {
                sortedString.append(keyChar);
            }
        }

        System.out.println(sortedString.toString());
    }
}
