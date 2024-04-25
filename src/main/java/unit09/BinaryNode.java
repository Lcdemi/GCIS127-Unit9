package unit09;

public class BinaryNode<E> {
    private E value;
    private BinaryNode<E> left;
    private BinaryNode<E> right;

    public BinaryNode(E value) {
        this.value = value;
        // this.right = right;
        // this.left = left;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public BinaryNode<E> getLeft() {
        return left;
    }

    public void setLeft(BinaryNode<E> left) {
        this.left = left;
    }

    public BinaryNode<E> getRight() {
        return right;
    }

    public void setRight(BinaryNode<E> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        String string = "BinaryNode{value=" + value;
        if(left != null) {
            string += ", left=" + left;
        }
        if(right != null) {
            string += ", right=" + right;
        }
        return string + "}";
    }

    public String infixTraversal() {
        String string = "";
        if(left != null) {
            string += left.infixTraversal();
        }

        string += value + " ";

        if(right != null) {
            string += right.infixTraversal();
        }

        return string;
    }

    public boolean search(E target) {
        if(((String) target).compareTo((String) getValue()) == 0) { 
            return true;
        } else if(left != null && left.search(target)) {
            return true;
        } else if(right != null && right.search(target)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        BinaryNode<String> node2 = new BinaryNode<>("A");
        BinaryNode<String> node3 = new BinaryNode<>("B");
        BinaryNode<String> node7 = new BinaryNode<>("F");
        BinaryNode<String> node9 = new BinaryNode<>("M");
        BinaryNode<String> node4 = new BinaryNode<>("L");
        BinaryNode<String> node1 = new BinaryNode<>("Z");
        BinaryNode<String> node6 = new BinaryNode<>("P");

        node2.setLeft(node3);
        node2.setRight(node7);
        node3.setLeft(node9);
        node3.setRight(node4);
        node7.setLeft(node1);
        node7.setRight(node6);
        
        System.out.println(node2);
        System.out.println(node2.infixTraversal());
        System.out.println(node2.search("B"));
        System.out.println(node2.search("Z"));
        System.out.println(node2.search("E"));
    }
}
