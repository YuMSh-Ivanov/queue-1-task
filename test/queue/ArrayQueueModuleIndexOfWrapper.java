package queue;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public class ArrayQueueModuleIndexOfWrapper extends ArrayQueueModuleWrapper implements QueueIndexOfWrapper {
    private final MethodHandle indexOf;
    private final MethodHandle lastIndexOf;

    public ArrayQueueModuleIndexOfWrapper() {
        MethodHandles.Lookup lookup = MethodHandles.publicLookup();
        try {
            indexOf = lookup.findStatic(arrayQueueModule, "indexOf", MethodType.methodType(int.class, Object.class));
            lastIndexOf = lookup.findStatic(arrayQueueModule, "lastIndexOf", MethodType.methodType(int.class, Object.class));
        } catch (final RuntimeException e) {
            throw e;
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int indexOf(final Object element) {
        try {
            return (int) indexOf.invokeExact(element);
        } catch (final Error | RuntimeException e) {
            throw e;
        } catch (final Throwable e) {
            throw new AssertionError("indexOf should not throw checked exceptions", e);
        }
    }

    @Override
    public int lastIndexOf(final Object element) {
        try {
            return (int) lastIndexOf.invokeExact(element);
        } catch (final Error | RuntimeException e) {
            throw e;
        } catch (final Throwable e) {
            throw new AssertionError("lastIndexOf should not throw checked exceptions", e);
        }
    }
}
