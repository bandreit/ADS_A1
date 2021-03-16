public class Operand extends Token {

    private int value;

    private CalculatorVisitor calculatorVisitor;

    public Operand() {
        this.value = 0;
    }

    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
