package queue;

public interface QueueIndexOfWrapper extends QueueWrapper {
    int indexOf(final Object element);
    int lastIndexOf(final Object element);
}
