
/**
 * Created by admarcu on 10/31/2016.
 */

public class AdrianLinkedList<T> {

    private LinkNode head;


    public AdrianLinkedList() {

    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        LinkNode<T> tmp = head;
        while (tmp != null) {
            s.append(tmp.get().toString() + " ");
            tmp = tmp.next;
        }
        return s.toString();
    }

    public void addFirst(T item) {
        head = new LinkNode<T>(item, head);
    }

    public void add(T item) {
        if (head == null) {
            addFirst(item);
        } else {
            LinkNode<T> tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new LinkNode<T>(item, null);
        }
    }

    public void remove() {
        this.head = this.head.next;

    }

    public T get(int i) {
        int counter = 0;
        LinkNode<T> tmp = head;

        while (tmp != null) {
            if (counter == i) {
                return tmp.get();
            }
            counter++;
            tmp = tmp.next;
        }
        return null;
    }

    public T peek() {
        if (head == null) throw new RuntimeException("cannot peek");
        if (head.get() == null) {
            return null;
        }
        return (T) head.get();
    }
}
