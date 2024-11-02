package leetcode.dp;

public class fivezeronine {
    public static void main(String[] args) {
        int n=100;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n==0)
            return 0;
        int p1=1;
        int p2=0;
        for (int i = 2; i < n; i++) {
            int c=p1+p2;
            p2=p1;
            p1=c;
        }
        return p1;
    }
}
