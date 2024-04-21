package queue;

import org.junit.Test;

import java.util.LinkedList;

public class ArrayQueueTest extends ArrayQueueBaseTest<QueueWrapper> {
    @Test
    public void testArrayQueueModule() {
        test(ArrayQueueModuleWrapper::new, LinkedList::new);
    }

    @Test
    public void testArrayQueueADT() {
        test(ArrayQueueADTWrapper::new, LinkedList::new);
    }

    @Test
    public void testArrayQueue() {
        test(ArrayQueueWrapper::new, LinkedList::new);
    }
}
