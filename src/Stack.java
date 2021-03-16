import java.util.EmptyStackException;

public interface Stack<T> {
    public abstract boolean isEmpty();

    public abstract void push(T elm);

    public abstract T pop() throws EmptyStackException, EmptyListException;
}
