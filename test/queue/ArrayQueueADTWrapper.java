package queue;

public class ArrayQueueADTWrapper implements QueueWrapper {
    protected final ArrayQueueADT data;

    public ArrayQueueADTWrapper() {
        this.data = new ArrayQueueADT();
    }

    @Override
    public void addLast(final Object element) {
        ArrayQueueADT.addLast(data, element);
    }

    @Override
    public Object removeFirst() {
        return ArrayQueueADT.removeFirst(data);
    }

    @Override
    public Object getFirst() {
        return ArrayQueueADT.getFirst(data);
    }

    @Override
    public int size() {
        return ArrayQueueADT.size(data);
    }

    @Override
    public boolean isEmpty() {
        return ArrayQueueADT.isEmpty(data);
    }

    @Override
    public void clear() {
        ArrayQueueADT.clear(data);
    }
}
