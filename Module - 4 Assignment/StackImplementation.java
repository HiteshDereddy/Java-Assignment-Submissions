
// 5. Stack implementation and its relation to List
import java.util.Stack;
public class StackImplementation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
    }
}
