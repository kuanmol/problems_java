package face.linklist;

import java.util.LinkedList;
import java.util.Scanner;

public class palin_ll {
    static boolean palin(LinkedList<Integer> linkedList, int n) {
        LinkedList<Integer> firsthalf = new LinkedList<>();

        for (int i = 0; i < n / 2; i++) {
            firsthalf.addLast(linkedList.get(i));
        }
        int secondhalf = n % 2 == 0 ? n / 2 : n / 2 + 1;

        for (int i = n - 1; i >= secondhalf; i--) {
            if (!linkedList.get(i).equals(firsthalf.remove())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            linkedList.add(scanner.nextInt());
        }
        boolean result = palin(linkedList, size);
        if (result) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
