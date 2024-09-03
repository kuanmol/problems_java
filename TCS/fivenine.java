package TCS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fivenine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String result = missingletter(s);
        System.out.println(result);
    }

    private static String missingletter(String s) {
        Set<Character> l = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            l.add(ch);
        }

        for (char ch : s.toLowerCase().toCharArray()) {
            l.remove(ch);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (l.contains(ch)) {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}
