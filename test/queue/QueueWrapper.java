package queue;

public interface QueueWrapper {
    void addLast(Object element);
    Object removeFirst();
    Object getFirst();
    int size();
    boolean isEmpty();
    void clear();
}
