package leetcode.string;

class sixseven {
    public static void main(String[] args) {
        sixseven solution = new sixseven();

        String a1 = "11";
        String b1 = "11";
        System.out.println("Input: a = " + a1 + ", b = " + b1);
        System.out.println("Output: " + solution.addBinary(a1, b1));
    }

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}

