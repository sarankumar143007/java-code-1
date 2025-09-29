package Postfix;

import java.util.*;

public class Infix_To_Postfix {

    // Function to convert Infix expression to Postfix
    public static String InfixtoPostfix(String[] s) {
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            String c = s[i];

            // If operand, add to output
            if (!isOperator(c) && !c.equals("(") && !c.equals(")")) {
                sb.append(c).append(" ");
            }
            // If "(", push to stack
            else if (c.equals("(")) {
                stack.push(c);
            }
            // If ")", pop until "("
            else if (c.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop()).append(" ");
                }
                if (!stack.isEmpty()) {
                    stack.pop(); // pop "("
                }
            }
            // Operator
            else {
                while (!stack.isEmpty() && prec(c) <= prec(stack.peek())) {
                    sb.append(stack.pop()).append(" ");
                }
                stack.push(c);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(" ");
        }

        return sb.toString().trim();
    }

    // Precedence of operators
    public static int prec(String c) {
        if (c.equals("*") || c.equals("/"))
            return 2;
        else if (c.equals("+") || c.equals("-"))
            return 1;
        return -1;
    }

    // Check if operator
    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] infix = {"(", "A", "+", "B", ")", "*", "C", "-", "D"};
        System.out.println("Infix: " + String.join(" ", infix));
        System.out.println("Postfix: " + InfixtoPostfix(infix));
    }
}
