import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {
    private Operator operator;
    private Operation operation;
    CalculatorVisitor calculatorVisitor;

    @BeforeEach
    void setUp()
    {
        operator = new Operator(operation);
        System.out.println("New test starts ->  ");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Test ended");
    }

    @Test
    void getOperation()
    {
        assertNull(operator.getOperation());
    }

    @Test
    void accept() throws MalformedExpressionException {
        System.out.println("Testing accept method...");
        calculatorVisitor = new CalculatorVisitor();
        operator.accept(calculatorVisitor);
    }

    @Test
    void acceptError() {
        System.out.println("Testing accept method -> error...");
        calculatorVisitor = null;
        assertThrows(NullPointerException.class,()->{
            operator.accept(calculatorVisitor);
        });
    }

}