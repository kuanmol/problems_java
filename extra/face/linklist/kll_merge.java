package extra.face.linklist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class kll_merge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            LinkedList<Integer> linkedList = new LinkedList<>();
            int num;
            while ((num = scanner.nextInt()) != -1) {
                linkedList.add(num);
            }
            list.addAll(linkedList);
        }

        Collections.sort(list);

        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
