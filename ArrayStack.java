package Stack;

public class ArrayStack {
    private int maxSize;       
    private int top;          
    private int[] stackArr; 

    
    public ArrayStack(int size) {
        this.maxSize = size;
        this.top = -1;
        this.stackArr = new int[maxSize];
    }

    
    public boolean isEmpty() {
        return top == -1;
    }

   
    public boolean isFull() {
        return top == maxSize - 1;
    }

   
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        stackArr[++top] = value;
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stackArr[top--];
    }

   
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stackArr[top];
    }

   
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stackArr[i] + " ");
        }
        System.out.println();
    }

   
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.display();

        System.out.println("Is empty? " + stack.isEmpty());
        System.out.println("Is full? " + stack.isFull());
    }
}
