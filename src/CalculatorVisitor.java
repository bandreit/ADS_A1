public class CalculatorVisitor implements Visitor, Calculator {

    private LinkedStack<Token> tokenStack;

    private void pushOperand(Operand operand) {

    }

    private void performOperation(Operator operator)
            throws MalformedExpressionException {

    }

    public void visit(Operand operand) {

    }

    public void visit(Operator operator) {

    }

    public int getResult() {
        return 0;
    }

}
