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
    void evaluateExpression() throws MalformedExpressionException, EmptyListException {
        tokenArrayList.add(new Operand(3));
        tokenArrayList.add(new Operand(7));
        tokenArrayList.add(new Operator(Operation.MULTIPLY));
        tokenArrayList.add(new Operand(2));
        tokenArrayList.add(new Operator(Operation.DIVIDE));
        tokenArrayList.add(new Operator(Operation.PLUS));

//        Assertions.assertThrows(MalformedExpressionException.class, () -> {
//            client.evaluateExpression(tokenArrayList);
//        });

        assertEquals(17, client.evaluateExpression(tokenArrayList));
    }

}
