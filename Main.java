import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String str = "A1B2C3";
        String lettersOnly = str.replaceAll("[0-9]", ""); // ABC
        System.out.println(lettersOnly);
    }
}