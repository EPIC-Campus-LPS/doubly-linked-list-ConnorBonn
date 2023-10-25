public class Node<E> {
    private E value;
    private Node<E> next;
    private Node<E> pre;

    public Node(E val, Node<E> n, Node<E> p) {
        this.value = val;
        this.next = n;
        this.pre = p;
    }

    public E getValue() {
        return value;
    }

    public Node<E> getNext() {
        return next;
    }

    public Node<E> getPre() {

        return pre;
    }

    public void setValue(E val) {
        value = val;
    }

    public void setNext(Node<E> n) {
        next = n;
    }

    public void setPre(Node<E> p) {
        pre = p;
    }
}
