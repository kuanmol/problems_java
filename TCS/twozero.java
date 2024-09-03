package TCS;

import java.util.Scanner;

public class twozero {

    static int reverse(int num, int sign) {
        String absStr = String.valueOf(Math.abs(num));
        StringBuilder stringBuilder = new StringBuilder(absStr).reverse();

        int finalnum;
        try {
            finalnum = Integer.parseInt(stringBuilder.toString()) * sign;
        } catch (NumberFormatException e) {

            finalnum = 0; // Or handle as needed
        }

        if (finalnum < Short.MIN_VALUE || finalnum > Short.MAX_VALUE) {
            return -1;
        } else {
            return finalnum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sign = num < 0 ? -1 : 1;
        int result = reverse(num, sign);

        if (result == -1) {
            System.out.println("Wrong Value");
        } else {
            System.out.println(result);
        }

        scanner.close();
    }
}
