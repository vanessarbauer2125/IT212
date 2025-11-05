package generics2;

import java.util.EmptyStackException;
import java.util.LinkedList;

// 2. Generic Stack<T>
public class Stack<T> {
    private LinkedList<T> elements = new LinkedList<>();

    public void push(T element) {
        elements.addFirst(element);
    }

    public T pop() {
        if (elements.isEmpty()) {
            throw new EmptyStackException();
        }
        return elements.removeFirst();
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public String toString() {
        return "Stack: " + elements.toString();
    }
}
