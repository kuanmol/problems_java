package leet;

public class threefourfour {
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            // Move the pointers
            left++;
            right--;
        }
    }

    public static void main(String[] args) {

        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s1);
        System.out.println(s1);
    }


}
