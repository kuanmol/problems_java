package leet;

public class onetwofive {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder filteredString = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filteredString.append(c);
            }
        }
        String filtered = filteredString.toString();

        int length = filtered.length();
        for (int i = 0; i < length / 2; i++) {
            if (filtered.charAt(i) != filtered.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s1));

        String s2 = "race a car";
        System.out.println(isPalindrome(s2));

        String s3 = " ";
        System.out.println(isPalindrome(s3));
    }
}