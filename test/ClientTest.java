import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class ClientTest {

    private ArrayList<Token> tokenArrayList;
    private Client client;

    @BeforeEach
    void setUp() {
        this.client = new Client();
        this.tokenArrayList = new ArrayList<Token>();
    }

    @Test
    void evaluateExpressionWithOneOperator() throws MalformedExpressionException, EmptyListException {
        tokenArrayList.add(new Operand(3));
        tokenArrayList.add(new Operand(7));
        tokenArrayList.add(new Operator(Operation.MULTIPLY));

        assertEquals(21, client.evaluateExpression(tokenArrayList));
    }

    @Test
    void evaluateExpressionWithMultipleOperators() throws MalformedExpressionException, EmptyListException {
        tokenArrayList.add(new Operand(4));
        tokenArrayList.add(new Operand(7));
        tokenArrayList.add(new Operand(2));
        tokenArrayList.add(new Operator(Operation.PLUS));
        tokenArrayList.add(new Operator(Operation.MULTIPLY));

        assertEquals(36, client.evaluateExpression(tokenArrayList));
    }


    @Test
    void evaluateMalformedExpressionMissingOneOperator() {
        tokenArrayList.add(new Operand(4));
        tokenArrayList.add(new Operand(7));
        tokenArrayList.add(new Operand(2));
        tokenArrayList.add(new Operator(Operation.PLUS));

        assertThrows(MalformedExpressionException.class,()->{
            client.evaluateExpression(tokenArrayList);
        });
    }

    @Test
    void evaluateMalformedExpressionMissingOperators() {
        tokenArrayList.add(new Operand(4));
        tokenArrayList.add(new Operand(7));
        tokenArrayList.add(new Operand(7));

        assertThrows(MalformedExpressionException.class,()->{
            client.evaluateExpression(tokenArrayList);
        });
    }

    @Test
    void evaluateMalformedExpressionMissingOperands() {
        tokenArrayList.add(new Operand(4));
        tokenArrayList.add(new Operand(7));
        tokenArrayList.add(new Operand(7));

        assertThrows(MalformedExpressionException.class,()->{
            client.evaluateExpression(tokenArrayList);
        });
    }
}
