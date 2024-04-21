package queue;

import base.pairs.Pair;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class ArrayQueueIndexOfTest extends ArrayQueueBaseTest<QueueIndexOfWrapper> {
    @Override
    protected void otherOperations(final List<Pair<QueueIndexOfWrapper, LinkedList<Object>>> queues, final Pair<QueueIndexOfWrapper, LinkedList<Object>> pair) {
        final Object element = randomElement();
        if (random.nextBoolean()) {
            Assert.assertEquals("indexOf(" + element + ") of <" + pair.second() + ", " + pair.first() + ">", pair.second().indexOf(element), pair.first().indexOf(element));
        } else {
            Assert.assertEquals("lastIndexOf(" + element + ") of <" + pair.second() + ", " + pair.first() + ">", pair.second().lastIndexOf(element), pair.first().lastIndexOf(element));
        }
    }

    @Test
    public void testArrayQueueModule() {
        test(ArrayQueueModuleIndexOfWrapper::new, LinkedList::new);
    }

    @Test
    public void testArrayQueueADT() {
        test(ArrayQueueADTIndexOfWrapper::new, LinkedList::new);
    }

    @Test
    public void testArrayQueue() {
        test(ArrayQueueIndexOfWrapper::new, LinkedList::new);
    }
}
