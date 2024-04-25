package unit09;

public class NodeBST<E extends Comparable<E>> implements BinarySearchTree<E> {
    private BinaryNode<E> root;
    private int size;

    public NodeBST() {
        this.root = null;
        this.size = 0;
    }

    private void binaryInsert(BinaryNode<E> node, E value) {
        if(value.compareTo(node.getValue()) < 0) {
            //insert into left
            BinaryNode<E> left = node.getLeft();
            if(left == null) {
                left = new BinaryNode<>(value);
                node.setLeft(left);
                size++;
            } else {
                binaryInsert(left, value);
            }
        } else {
            //insert into right
            BinaryNode<E> right = node.getRight();
            if(right == null) {
                right = new BinaryNode<>(value);
                node.setRight(right);
                size++;
            } else {
                binaryInsert(right, value);
            }
        }
    }

    @Override
    public void insert(E value) {
        if(root == null) {
            root = new BinaryNode<>(value);
            size++;
        } else {
            binaryInsert(root, value);
        }
    }

    private boolean binarySearch(BinaryNode<E> node, E target) {
        if(node == null) {
            return false;
        } else if(target.compareTo(node.getValue()) == 0) {
            return true;
        } else if(target.compareTo(node.getValue()) < 0) {
            return binarySearch(node.getLeft(), target);
        } else {
            return binarySearch(node.getRight(), target);
        }
    }

    @Override
    public boolean search(E target) {
        return binarySearch(root, target);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if(root == null) {
            return "<empty>";
        } else {
            return root.infixTraversal();
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<String> bst = new NodeBST<>();
        System.out.println(bst);

        bst.insert("A");
        bst.insert("B");
        bst.insert("O");
        bst.insert("Y");
        bst.insert("K");
        bst.insert("J");
        bst.insert("F");
        System.out.println(bst);

        System.out.println(bst.search("Y"));
        System.out.println(bst.search("F"));
        System.out.println(bst.search("D"));
    }
    
}
