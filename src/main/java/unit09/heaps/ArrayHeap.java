package unit09.heaps;

import java.util.Arrays;

public class ArrayHeap implements Heap {
    private int[] elements;
    private int size;

    public ArrayHeap() {
        this.elements = new int[3];
        this.size = 0;
    }

    @Override
    public void add(int value) {
        if(size == elements.length) {
            elements = Arrays.copyOf(elements, size * 2);
        }
        elements[size] = value;
        //implement sift-up
        int child = size;
        int parent = (child-1) / 2;
        while(elements[child] < elements[parent]) {
            swap(child, parent);
            child = parent;
            parent = (child - 1) / 2;
        }
        size++;
    }

    private void swap(int a, int b) {
        if(a!=b) {
            int temp = elements[a];
            elements[a] = elements[b];
            elements[b] = temp;
        }
    }

    @Override
    public int remove() {
        int value = elements[0];
        swap(0, size-1);
        elements[size-1] = 0;
        size--;

        //implement sift-down
        int parent = 0;
        while(true) {
            int dest = parent;
            int left = (2*parent) + 1;
            int right = left + 1;

            if(left < size && elements[left] < elements[right]) {
                dest = left;
            }
            if(right < size && elements[right] < elements[dest]) {
                dest = right;
            }
            if(parent != dest) {
                swap(parent, dest);
                parent = dest;
            } else {
                break;
            }
        }

        return value;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        return size + " " + Arrays.toString(elements);
    }

    public static void main(String[] args) {
        Heap heap = new ArrayHeap();
        System.out.println(heap);

        heap.add(10);
        heap.add(1);
        heap.add(5);
        heap.add(3);

        System.out.println(heap);
        while(heap.size() > 0) {
            System.out.println(heap.remove());
            System.out.println(heap);
        }
    }
    
}
