package TCS;

import java.util.Arrays;
import java.util.Scanner;

public class fivesix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            ch[i] = s.charAt(i);
        }
        Arrays.sort(ch);

        if (ch[0] == '0') {
            for (int i = 1; i < ch.length; i++) {
                if (ch[i] != '0') {
                    char temp = ch[0];
                    ch[0] = ch[i];
                    ch[i] = temp;
                    break;
                }
            }
        }
        String result = new String(ch);

        System.out.println(result);

    }
}
