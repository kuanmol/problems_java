package extra.face.stack;

import java.util.Scanner;
import java.util.Stack;

class posteval {

    public static int evaluatePostfix(String exp) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;

                switch (c) {
                    case '+':
                        result = operand1 + operand2;
                        break;
                    case '-':
                        result = operand1 - operand2;
                        break;
                    case '*':
                        result = operand1 * operand2;
                        break;
                    case '/':
                        result = operand1 / operand2;
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + c);
                }

                stack.push(result);
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exp = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < exp; i++) {
            String postfixExpression = scanner.nextLine();
            int result = evaluatePostfix(postfixExpression);
            System.out.println();
            System.out.println(result);
        }

    }
}
