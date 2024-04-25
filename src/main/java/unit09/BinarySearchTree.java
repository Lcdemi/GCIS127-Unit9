package unit09;

public interface BinarySearchTree<E extends Comparable<E>> {
    public void insert(E value);

    public boolean search(E target);

    public int size();
}
