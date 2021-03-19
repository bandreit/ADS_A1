import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    void setUp() {
        this.linkedList = new LinkedList<Integer>();
        System.out.println("New test starts ->  ");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @Test
    void addToFrontOne() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(69);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void addToFrontMany() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(69);
        linkedList.addToFront(69);
        linkedList.addToFront(69);
        assertEquals(3, linkedList.size());
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void addToFrontBoundary () {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(69);
        assertEquals(1, linkedList.size());
        assertFalse(linkedList.isEmpty());

        linkedList.addToFront(69);
        linkedList.addToFront(69);
        assertEquals(3, linkedList.size());
        assertFalse(linkedList.isEmpty());
    }


    @Test
    void isEmpty() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(69);
        linkedList.addToFront(69);
        assertFalse(linkedList.isEmpty());
    }

    @Test
    void size() {
        linkedList.addToFront(69);
        linkedList.addToFront(69);
        assertEquals(2, linkedList.size());
    }

    @Test
    void removeFirst() {
        linkedList.addToFront(69);
        linkedList.addToFront(69);
        try {
            linkedList.removeFirst();
        } catch (EmptyListException e) {
            e.printStackTrace();
        }
        assertEquals(1, linkedList.size());
    }

    @Test
    void removeFirstException() {
        Assertions.assertThrows(EmptyListException.class, () -> {
            linkedList.removeFirst();
        });
    }
}