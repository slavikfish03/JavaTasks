import java.util.Arrays;

class Stack<T> {
    private Object[] stackArray;
    private int size = 0;

    public Stack(int size_stack) {
        stackArray = new Object[size_stack];
    }

    public Stack() {
        this(10);
    }

    public void push(T value) {
        increaseCapacity();
        stackArray[size] = value;
        size++;
    }

    public T pop() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return null;
        }
        size--;
        T value = (T) stackArray[size];
        stackArray[size] = null;
        return value;
    }

    public T peek() {
        if (size == 0) {
            System.out.println("Stack is empty");
            return null;
        }
        return (T) stackArray[size - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void increaseCapacity() {
        if (size == stackArray.length) {
            stackArray = Arrays.copyOf(stackArray, stackArray.length * 2);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>(5);

        stack.push(1);
        stack.push(0);
        stack.push(7);
        stack.push(4);
        stack.push(6);
        System.out.println("Stack integer size: " + (stack.size()));

        System.out.println("Top in stack integer: " + stack.peek());

        System.out.print("Stack elements before deleting: ");
        while (!stack.isEmpty()) {
            int value = stack.pop();
            System.out.print(value + " ");
        }

        System.out.println();
        Stack<String> stack1 = new Stack<>();

        stack1.push("a");
        stack1.push("b");
        stack1.push("c");
        stack1.push("d");
        stack1.push("e");
        System.out.println("Stack string size: " + (stack1.size()));

        System.out.println("Top element in string size: " + stack1.peek());

    }
}