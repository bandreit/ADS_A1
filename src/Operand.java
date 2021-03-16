public class Operand extends Token {

    private int value;

    private CalculatorVisitor calculatorVisitor;

    public void accept(CalculatorVisitor visitor) {

    }

    public int getValue() {
        return 0;
    }
}
