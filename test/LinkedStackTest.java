import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest {

    LinkedStack<String> stack;

    @BeforeEach
    void setUp() {
        System.out.println("New test starts ->  ");
        stack = new LinkedStack<>();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @Test
    void isEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void isNotEmpty() {
        stack.push("opa");
        assertFalse(stack.isEmpty());
    }

    @Test
    void pushOne() throws EmptyListException {
        stack.push("opa");
        assertEquals("opa",stack.pop());
    }

    @Test
    void pushMany() throws EmptyListException {
        stack.push("opa");
        stack.push("opaopa");
        assertEquals("opaopa",stack.pop());
    }

    @Test
    void pushException() {
        Assertions.assertThrows(EmptyListException.class, () -> {
            stack.pop();
        });
    }

    @Test
    void pop() throws EmptyListException {
        stack.push("opa");
        assertEquals("opa",stack.pop());
    }

    @Test
    void popException() {
        assertThrows(EmptyListException.class,()->{
            stack.pop();
        });
    }
}