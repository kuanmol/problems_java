package leetcode.string;

import java.util.Stack;

public class twozero {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] openBrackets = {'(', '{', '['};
        char[] closeBrackets = {')', '}', ']'};

        for (char c : s.toCharArray()) {
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isOpeningBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private static boolean isClosingBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String s = "{{}";
        System.out.println(isValid(s));
    }
}
