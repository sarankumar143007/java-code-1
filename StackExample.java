package Example;

import java.util.Stack; // ✅ Required import

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(); // ✅ Use lowercase variable name

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peeking at the top element
        int topElement = stack.peek(); // ✅ Fixed typo: peak → peek
        System.out.println("Top Element: " + topElement);

        // Popping (removing) top element
        int removedElement = stack.pop(); // ✅ Fixed variable name
        System.out.println("Removed Element: " + removedElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty(); // ✅ Fixed typo: boolan → boolean
        System.out.println("Is Stack Empty? " + isEmpty);

        // Getting the size of the stack
        int size = stack.size();
        System.out.println("Stack Size: " + size);

        // Checking if stack contains 20
        boolean contains20 = stack.contains(20);
        System.out.println("Stack contains 20? " + contains20);

        // Clearing the stack
        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
