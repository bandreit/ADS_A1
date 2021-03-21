import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {
    CalculatorVisitor visitor;

    @BeforeEach
    void setUp() {
        System.out.println("Test starts");
        visitor = new CalculatorVisitor();
    }

    @Test
    void getResult() {
        assertThrows(MalformedExpressionException.class, () -> {
            visitor.getResult();
        });
    }
}