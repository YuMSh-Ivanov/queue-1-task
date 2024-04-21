package queue;

public class ArrayQueueIndexOfWrapper extends ArrayQueueWrapper implements QueueIndexOfWrapper {
    @Override
    public int indexOf(final Object element) {
        return data.indexOf(element);
    }

    @Override
    public int lastIndexOf(final Object element) {
        return data.lastIndexOf(element);
    }
}
