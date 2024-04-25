package unit09.practicum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Iterator;

import org.junit.jupiter.api.Test;

public class ArrayTupleTest<E> {

    @Test
    public void constructor() {
        // setup
        Object[] elements = new Object[]{1, false, "abc", 'b'};

        // invoke
        ArrayTuple<E> tuple = new ArrayTuple<E>(elements);

        // analyze
        assertEquals("(1, false, abc, b)", tuple.toString());
    }

    @Test
    public void get() {
        // setup
        Object[] elements = new Object[]{1, false, "abc", 'b'};
        int index = 2;

        // invoke
        ArrayTuple<E> tuple = new ArrayTuple<E>(elements);

        // analyze
        assertEquals(elements[index], tuple.get(index));

    }

    @Test
    public void size() {
        // setup
        Object[] elements = new Object[]{1, false, "abc", 'b'};

        // invoke
        ArrayTuple<E> tuple = new ArrayTuple<E>(elements);

        // analyze
        assertEquals(4, tuple.size());

    }

    @Test
    public void iterator() {
        // setup
        Object[] elements = new Object[]{1, false, "abc", 'b'};

        // invoke
        ArrayTuple<E> tuple = new ArrayTuple<E>(elements);

        // analyze
        Iterator<E> iterator = tuple.iterator();
        int index = 0;
        while(iterator.hasNext()) {
            assertEquals(elements[index], iterator.next());
            index++;
        }
    }
}
