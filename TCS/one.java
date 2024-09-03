package TCS;

public class one {
    public static void main(String[] args) {
        String input = "ICOCICIAOBI";
        int resut = solvestring(input);
        System.out.println(resut);
    }

    private static int solvestring(String input) {
        int curr = 0;
        boolean firstval = true;

        for (int i = 0; i < input.length(); i++) {
            char currchar = input.charAt(i);
            if (currchar == 'I') {
                curr = operation(curr, 1, firstval);
                firstval = false;
            } else if (currchar == 'O') {
                curr = operation(curr, 0, firstval);
                firstval = false;
            } else {
                firstval = true;
            }
        }
        return curr;
    }

    private static int operation(int curr, int i, boolean firstval) {
        if (firstval) {
            return i;
        }

        switch (curr) {
            case 'C':
                return curr ^ i;
            case 'B':
                return curr | i;
            case 'A':
                return curr & i;
            default:
                return i;
        }

    }
}
