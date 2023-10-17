public class Node<E> {
    private E value;
    private Node<E> next;
    private Node<E> pre;

    public Node( E val, Node<E> n, Node<E> p){
        value = val;
        next = n;
        pre = p;
    }
    public E getValue(){
        return value;
    }
    public Node<E> getNext(){
        return next;
    }
    public Node<E> getPre(){
        return pre;
    }
    public void setValue(){
        value = val;
    }
}
