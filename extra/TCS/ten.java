package extra.TCS;

import java.util.Scanner;

public class ten {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int count30 = 0;
        int count60 = 0;
        int count120 = 0;

        boolean transactionFailed = false;

        for (int i = 0; i < n; i++) {
            if (a[i] == 30) {
                count30++;
            } else if (a[i] == 60) {
                if (count30 > 0) {
                    count30--;
                } else {
                    System.out.println("Transaction failed");
                    transactionFailed = true;
                    break;
                }
                count60++;
            } else if (a[i] == 120) {
                if (count30 > 0 && count60 > count30) {
                    count30--;
                    count60--;
                } else if (count30 >= 3) {
                    count30 = count30 - 3;
                } else {
                    System.out.println("Transaction failed");
                    transactionFailed = true;
                    break;
                }
            }
        }

        if (!transactionFailed) {
            System.out.println("Transaction successful");
        }
    }
}
