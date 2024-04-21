package queue;

public class ArrayQueueWrapper implements QueueWrapper {
    protected final ArrayQueue data;

    public ArrayQueueWrapper() {
        data = new ArrayQueue();
    }

    @Override
    public void addLast(final Object element) {
        data.addLast(element);
    }

    @Override
    public Object removeFirst() {
        return data.removeFirst();
    }

    @Override
    public Object getFirst() {
        return data.getFirst();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public void clear() {
        data.clear();
    }

    /* @Override
    public String toString() {
        return data.toString();
    } */
}
