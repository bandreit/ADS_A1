public interface Visitor {

    public abstract void visit(Operand operand);

    public abstract void visit(Operator operator);

}
