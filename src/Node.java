public class Node<T> {

    private T data;

    private Node<T> next;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setNext(Node<T> Node) {
        this.next = Node;
    }

    public Node<T> getNext() {
        return this.next;
    }
}
