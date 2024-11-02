package extra.hackerank;

import java.util.Arrays;
import java.util.Scanner;

public class posmissing {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result=solve(arr);
        System.out.println(result);
    }

    private static int solve(int[] arr) {
        
        Arrays.sort(arr);
        int t=arr[0];
        t--;
        return t;
    }
}
