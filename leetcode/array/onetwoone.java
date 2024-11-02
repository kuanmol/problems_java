package leetcode.array;

public class onetwoone {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int Maxpro=0;
        int Minprice= Integer.MAX_VALUE;
        for (int price : prices) {
            Minprice = Math.min(Minprice, price);
            Maxpro = Math.max(Maxpro, price - Minprice);
        }
        return Maxpro;
    }
}
