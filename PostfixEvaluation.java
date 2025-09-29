package Evaluation;
import java.util.*;

public class PostfixEvaluation {

    public static int postfixEval(String[] s) {
        Stack<Integer> stack = new Stack<>();
        for (String c : s) {
            if (isOperator(c)) {
                int val1 = stack.pop();
                int val2 = stack.pop();
                if (c.equals("+")) {
                    stack.push(val2 + val1);
                } else if (c.equals("-")) {
                    stack.push(val2 - val1);
                } else if (c.equals("*")) {
                    stack.push(val2 * val1);
                } else if (c.equals("/")) {
                    stack.push(val2 / val1);
                }
            } else {
                stack.push(Integer.parseInt(c));
            }
        }
        return stack.pop();
    }

    public static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
    }

    public static void main(String[] args) {
        String post = "5 1 2 + 4 * + 3 -";
        String arr[] = post.split(" ");
        System.out.println(postfixEval(arr));
    }
}
