public abstract class Token {

    private CalculatorVisitor visitor;

    private CalculatorVisitor calculatorVisitor;

    public abstract void accept(CalculatorVisitor visitor);

}
