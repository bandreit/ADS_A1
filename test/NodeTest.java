import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    Operand operand;
    Node<Object> node;

    @BeforeEach
    void setUp() {
        System.out.println("New test starts ->  ");
        this.node = new Node<>(operand);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended  ");
    }

    @Test
    void setDataOne() {
        node.setData(5);
        assertEquals(5,node.getData());
    }

    @Test
    void setDataOneMany() {
        node.setData(5);
        assertEquals(5,node.getData());
        node.setData(7);
        node.setData(6);
        assertEquals(6,node.getData());
    }

    @Test
    void getData() {
        node.setData(6);
        assertEquals(6, node.getData());
    }

    @Test
    void setNext() {
        System.out.println("setNext");
        node.setData(3);
        Node<Object> node1 = new Node<>(5);
        node.setNext(node1);
        assertEquals(5,node.getNext().getData());
    }

    @Test
    void getNext() {
        System.out.println("getNext");
        node.setData(3);
        Node<Object> node1 = new Node<Object>(5);
        node.setNext(node1);
        assertEquals(5,node.getNext().getData());
    }
}