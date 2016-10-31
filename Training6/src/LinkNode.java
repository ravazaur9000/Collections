/**
 * Created by admarcu on 10/31/2016.
 */
public class LinkNode<T> {

    private T data;
    public LinkNode<T> next;


    public T get(){
        return this.data;
    }
    public LinkNode(T item, LinkNode<T> next) {

        this.data = item;
        this.next = next;
    }

}