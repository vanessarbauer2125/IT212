package generics2tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.EmptyStackException;
import generics2.*;

public class StackTests {

    @Test
    void pushAndPop_shouldFollowLIFO() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        assertEquals(3, stack.pop());
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
        assertTrue(stack.isEmpty());
    }

    @Test
    void pop_emptyStack_shouldThrowException() {
        Stack<String> stack = new Stack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    void isEmpty_shouldReturnTrueForNewStack() {
        Stack<Double> stack = new Stack<>();
        assertTrue(stack.isEmpty());
    }

    @Test
    void toString_shouldIncludeElements() {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        assertTrue(stack.toString().contains("A"));
        assertTrue(stack.toString().contains("B"));
    }
}
