package leetcode.string;

public class fouronefive {
    public static void main(String[] args) {
        String s1 = "121", s2 = "234";
        System.out.println(addStrings(s1, s2));
    }

    public static String addStrings(String num1, String num2) {

        StringBuilder result = new StringBuilder();

        int pointer1 = num1.length() - 1;
        int pointer2 = num2.length() - 1;
        int carry = 0;
        while (pointer1 >= 0 || pointer2 >= 0 || carry == 1) {  // Continue while there are digits to process or carry

            int val1 = (pointer1 >= 0) ? num1.charAt(pointer1) - '0' : 0;
            int val2 = (pointer2 >= 0) ? num2.charAt(pointer2) - '0' : 0;

            int sum = val1 + val2 + carry;  // Calculate the sum of the digits and the carry

            int digit = sum % 10;
            carry = sum / 10;
            result.append(digit);  // Append the current digit to the result

            pointer1--;  // Move pointer1 to the left (next digit)
            pointer2--;  // Move pointer2 to the left (next digit)
        }

        return result.reverse().toString();

    }

}
