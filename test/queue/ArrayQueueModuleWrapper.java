package queue;

import java.io.File;
import java.io.IOException;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URLClassLoader;
import java.net.URL;

public class ArrayQueueModuleWrapper implements QueueWrapper {
    private final MethodHandle addLast;
    private final MethodHandle removeFirst;
    private final MethodHandle getFirst;
    private final MethodHandle size;
    private final MethodHandle isEmpty;
    private final MethodHandle clear;

    public ArrayQueueModuleWrapper() {
        try {
            final Class<?> arrayQueueModule;
            final MethodHandles.Lookup lookup;
            try (final URLClassLoader loader = new URLClassLoader(new URL[]{new File("src").toURI().toURL()})) {
                arrayQueueModule = loader.loadClass("queue.ArrayQueueModule");
                lookup = MethodHandles.publicLookup();
            }

            addLast = lookup.findStatic(arrayQueueModule, "addLast", MethodType.methodType(void.class, Object.class));
            removeFirst = lookup.findStatic(arrayQueueModule, "removeFirst", MethodType.methodType(Object.class));
            getFirst = lookup.findStatic(arrayQueueModule, "getFirst", MethodType.methodType(Object.class));
            size = lookup.findStatic(arrayQueueModule, "size", MethodType.methodType(int.class));
            isEmpty = lookup.findStatic(arrayQueueModule, "isEmpty", MethodType.methodType(boolean.class));
            clear = lookup.findStatic(arrayQueueModule, "clear", MethodType.methodType(void.class));
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addLast(final Object element) {
        try {
            addLast.invokeExact(element);
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable e) {
            throw new AssertionError("addLast should not throw checked exceptions", e);
        }
    }

    @Override
    public Object removeFirst() {
        try {
            return removeFirst.invokeExact();
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable e) {
            throw new AssertionError("removeFirst should not throw checked exceptions", e);
        }
    }

    @Override
    public Object getFirst() {
        try {
            return getFirst.invokeExact();
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable e) {
            throw new AssertionError("getFirst should not throw checked exceptions", e);
        }
    }

    @Override
    public int size() {
        try {
            return (int) size.invokeExact();
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable e) {
            throw new AssertionError("size should not throw checked exceptions", e);
        }
    }

    @Override
    public boolean isEmpty() {
        try {
            return (boolean) isEmpty.invokeExact();
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable e) {
            throw new AssertionError("isEmpty should not throw checked exceptions", e);
        }
    }

    @Override
    public void clear() {
        try {
            clear.invokeExact();
        } catch (Error | RuntimeException e) {
            throw e;
        } catch (Throwable e) {
            throw new AssertionError("clear should not throw checked exceptions", e);
        }
    }
}
