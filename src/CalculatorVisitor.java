import java.util.EmptyStackException;

public class CalculatorVisitor implements Visitor, Calculator {

    private LinkedStack<Token> tokenStack;

    public CalculatorVisitor() {
        this.tokenStack = new LinkedStack<>();
    }

    private void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator)
            throws MalformedExpressionException {

        try {
            Operand operand1 = (Operand) tokenStack.pop();
            Operand operand2 = (Operand) tokenStack.pop();

            switch (operator.getOperation()) {
                case MULTIPLY : operand1.setValue(operand2.getValue() * operand1.getValue());
                case PLUS : operand1.setValue(operand2.getValue() + operand1.getValue());
                case MINUS : operand1.setValue(operand2.getValue() - operand1.getValue());
                case DIVIDE : operand1.setValue(operand2.getValue() / operand1.getValue());
            }
            pushOperand(operand1);
        }
        catch (EmptyStackException | EmptyListException e)
        {
            throw new MalformedExpressionException("MalformedExpressionException");
        }
    }

    public void visit(Operand operand) {
        pushOperand(operand);
    }

    public void visit(Operator operator) throws MalformedExpressionException {
        performOperation(operator);
    }

    public int getResult() throws MalformedExpressionException, EmptyListException {
        if(tokenStack.isEmpty())
        {
            throw new MalformedExpressionException("MalformedExpressionException");
        }
        Operand operand = (Operand) tokenStack.pop();

        // Caroci e interesanta idea de a controla inaite si , Johnny malates,
        // imi place, dar daca asa si trebuie ap ok
        if(!tokenStack.isEmpty())
        {
            throw new MalformedExpressionException("MalformedExpressionException");
        }
        return operand.getValue();
    }

}
