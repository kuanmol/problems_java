package TCS;

import java.util.Scanner;

public class eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String ans = removechar(str1);
        System.out.println(ans);
    }

    private static String removechar(String str1) {
        String cleanedStr = str1.replaceAll("EF|G", "");

        return cleanedStr;
    }
}
