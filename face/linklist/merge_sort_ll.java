package face.linklist;

import java.util.LinkedList;
import java.util.Scanner;

class Main1 {

    static void merged(LinkedList<Integer> ll1, LinkedList<Integer> ll2, int n1, int n2) {
        LinkedList<Integer> ans = new LinkedList<Integer>();
        int ptr1 = 0, ptr2 = 0;
        while (ptr1 < n1 && ptr2 < n2) {
            if (ll1.get(ptr1) >= ll2.get(ptr2)) {
                ans.add(ll2.get(ptr2));
                ptr2++;
            } else if (ll1.get(ptr1) < ll2.get(ptr2)) {
                ans.add(ll1.get(ptr1));
                ptr1++;
            }
        }
        while (ptr1 < n1) {
            ans.add(ll1.get(ptr1));
            ptr1++;
        }
        while (ptr2 < n2) {
            ans.add(ll2.get(ptr2));
            ptr2++;
        }
        for (int i = 0; i < ans.size(); i++) {
            if (i != ans.size() - 1) {
                System.out.print(ans.get(i) + " ->");
            } else {
                System.out.println(ans.get(i) + "null");
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        LinkedList<Integer> ll2 = new LinkedList<Integer>();
        Scanner cin = new Scanner(System.in);
        int size1 = cin.nextInt();
        int size2 = cin.nextInt();
        for (int i = 0; i < size1; i++) {
            ll1.add(cin.nextInt());
        }
        for (int i = 0; i < size2; i++) {
            ll1.add(cin.nextInt());
        }
        merged(ll1, ll2, size1, size2);
    }
}
