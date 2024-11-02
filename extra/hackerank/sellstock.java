package extra.hackerank;

import java.io.*;
import java.util.*;

public class sellstock {

    static int maxProfit(int[] arr){
        if(arr==null || arr.length==0){
            return 0;
        }

        Map<Integer,Integer> map=new HashMap<>();
        int minp=Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            minp=Math.min(arr[i],minp);
            map.put(i,minp);
        }

        int maxp=0;
        for(int i=0; i<arr.length; i++){
            int profit=arr[i]-map.get(i);
            maxp=Math.max(maxp,profit);
        }
        return maxp;
    }

    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        int size=cin.nextInt();
        int[] arr=new int[size];
        for(int i=0; i<size; i++){
            int value=cin.nextInt();
            arr[i]=value;
        }
        int result=maxProfit(arr);
        System.out.println(result);
    }
}
