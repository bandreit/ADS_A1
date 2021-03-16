import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.*;

public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeEach
    public void setUp(){
        linkedList = new LinkedList<Integer>();
    }

    @Test
    public void testAddToFront() {
        assertTrue(linkedList.isEmpty());
        linkedList.addToFront(69);
        linkedList.addToFront(69);
        assertEquals(2, linkedList.size());
        assertFalse(linkedList.isEmpty());
    }
}
