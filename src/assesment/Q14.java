package assesment;

import java.util.Stack;

public class Q14 {
    public static void main(String[] args) {
        String word = "})";
        Stack<Character> stack = new Stack<>();

        char[] charArray = word.toCharArray();

        for (char c : charArray) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    System.out.println(false);
                }
            } else if (c == '}') {
                if (stack.isEmpty() || stack.pop() != '{') {
                    System.out.println(false);
                }
            } else if (c == ']') {
                if (stack.isEmpty() || stack.pop() != '[') {
                    System.out.println(false);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
