package TCS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class fiveeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int result = norepeat(n1, n2);
        System.out.println(result);
    }

    private static int norepeat(int n1, int n2) {
        int count = 0;
        for (int i = n1; i <= n2; i++) {
            if (checkbool(i)){
                count++;
            }
        }
        return count;
    }

    private static boolean checkbool(int i) {
        Set<Integer> dig = new HashSet<>();
        while (i > 0) {
            int last = i % 10;
            if (dig.contains(last)) {
                return false;
            }
            dig.add(last);
            i /= 10;
        }
        return true;
    }
}