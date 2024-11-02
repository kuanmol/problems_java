package leetcode.gen;

public class oneninezero {

    public static void main(String[] args) {
        int testInput1 = 0b00000010100101000001111010011100; // Binary representation of 43261596

        System.out.println(reverseBits(testInput1));
    }

    private static int reverseBits(int n) {
        if (n == 0) {
            return 0;
        }

        int ans = 0;
        for (int i = 0; i < 32; i++) {
            ans <<= 1;
            ans = ans + (n & 1);
            n >>= 1;
        }
        return ans;
    }
}
