import java.util.ArrayList;

public class GenericStack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }

    public T peek() {
        if (!stack.isEmpty()) {
            return stack.get(stack.size() - 1);
        }
        return null;
    }

    public static void main(String[] args) {
        GenericStack<Integer> intStack = new GenericStack<>();
        intStack.push(10);
        intStack.push(20);
        System.out.println("Top: " + intStack.peek());
        System.out.println("Popped: " + intStack.pop());

        GenericStack<String> strStack = new GenericStack<>();
        strStack.push("Hello");
        strStack.push("World");
        System.out.println("Top: " + strStack.peek());
    }
}
