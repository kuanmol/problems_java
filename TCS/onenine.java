package TCS;

import java.util.Scanner;

public class onenine {
    static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);
    }

    static int change(int number) {
        int k = 0;
        String numberString = Integer.toString(number);

        int[] digits = new int[numberString.length()];

        for (int i = 0; i < numberString.length(); i++) {
            digits[i] = numberString.charAt(i) - '0';
        }

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == 0) {
                k++;
            }
        }
        int divid = (int) Math.pow(10, k);
        int finalnum = number / divid;

        char[] digit = Integer.toString(finalnum).toCharArray();

        for (int i = digit.length - 1; i >= 0; i--) {
            if (digit[i] != '0') {
                return digit[i] - '0';
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int n = fact(num);
        System.out.println(change(n));
    }
}
