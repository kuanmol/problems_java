package extra.hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class hasmap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "anmol");
        hashMap.put(11, "kumar");
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println(hashMap.entrySet());
    }
}
