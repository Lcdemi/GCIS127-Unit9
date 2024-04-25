package unit09.practicum;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayTuple<E> implements Tuple<E> {
    private Object[] elements;

    public ArrayTuple(Object[] elements) {
        this.elements = elements;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(elements, size());
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        int counter = 0;
        for(Object element : elements) {
            if(counter == index) {
                return (E)element;
            }
            counter++;
        }
        return (E)"Invalid Index";
    }

    @Override
    public int size() {
        return elements.length;
    }

    @Override
    public String toString() {
        //System.out.println(Arrays.toString(elements));
        String newString = "(";
        Iterator<E> iterator = iterator();
        while(iterator.hasNext()) {
            newString += iterator.next();
            if (iterator.hasNext()) {
                newString += ", ";
            }
        }
        newString += ")";
        return newString;
    } 
}
