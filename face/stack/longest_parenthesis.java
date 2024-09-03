package face.stack;

import java.util.Scanner;
import java.util.Stack;

public class longest_parenthesis {


    public static int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = 0;
        stack.push(-1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    maxLen = Math.max(maxLen, i - stack.peek());
                    System.out.println(stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string of parentheses:");
        String input = scanner.nextLine();
        int maxLength = longestValidParentheses(input);
        System.out.println("Longest valid parentheses substring length: " + maxLength);
        scanner.close();
    }

}
