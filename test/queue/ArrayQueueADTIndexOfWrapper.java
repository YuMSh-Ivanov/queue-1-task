package queue;

public class ArrayQueueADTIndexOfWrapper extends ArrayQueueADTWrapper implements QueueIndexOfWrapper {
    @Override
    public int indexOf(final Object element) {
        return ArrayQueueADT.indexOf(data, element);
    }

    @Override
    public int lastIndexOf(final Object element) {
        return ArrayQueueADT.lastIndexOf(data, element);
    }
}
