import java.util.Arrays;

public class DoublyLinkedList<E> {
    //creates head and tail node
    private Node<E> head;
    private Node<E> tail;

    private int size = 0;
    /**
     * @param element
     */
    public void add(E element) {
        size++;
        Node<E> temp = new Node<E>(element, null, null);
        //sets value to tail and head if list is empty
        if (head == null) {
            head = temp;
        }
        else if(size == 1){
            head.setNext(temp);
            tail = temp;
        }
        else {
            //puts value at the end
            tail.setNext(temp);
            temp.setPre(tail);
            tail = temp;
        }
    }

    /**
     * @param index
     * @param element
     */
    void add(int index, E element) {
        Node<E> newElement = new Node<E>(element, null, head);
        for (int i = 0; i < index; i++) {
            newElement = newElement.getNext();
        }
        Node<E> next = newElement.getNext();
        next.setPre(newElement);
        newElement.setNext(next);

    size++;
    }

    public String toString() {
        Node<E> start = head;
        String[] list = new String[size];
        for (int i = 0; i < size; i++) {

            list[i] = String.valueOf(start.getValue());
            start.getNext();
        }
        return Arrays.toString(list);
    }
}
