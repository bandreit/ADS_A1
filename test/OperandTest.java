import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    private Operand operand;
    CalculatorVisitor calculatorVisitor;

    @BeforeEach
    void setUp() {
        System.out.println("New test starts ->  ");
        operand = new Operand(5);
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @Test
    void acceptError() {
        System.out.println("Testing accept method -> error...");
        calculatorVisitor = null;
        assertThrows(NullPointerException.class,()->{
            operand.accept(calculatorVisitor);
        });
    }

    @Test
    void getValue() {
        System.out.println("Testing accept getValue...");
        assertEquals(5,operand.getValue());
    }
}