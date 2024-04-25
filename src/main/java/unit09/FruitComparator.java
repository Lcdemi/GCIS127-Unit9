package unit09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FruitComparator implements Comparator<Fruit> {

    @Override
    public int compare(Fruit f1, Fruit f2) {
        double diff = f1.getPrice() - f2.getPrice(); // may be < 1
        if(diff == 0) {
            return f1.compareTo(f2);
        } else if(diff < 0) {
            return -1;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        List<Fruit> fruit = new ArrayList<>();
        fruit.add(new Fruit("Orange", 1.50));
        fruit.add(new Fruit("Apple", 1.25));
        fruit.add(new Fruit("Banana", 0.75));
        fruit.add(new Fruit("Mango", 2.55));
        fruit.add(new Fruit("Kiwi", 1.25));

        System.out.println(fruit);
        Collections.sort(fruit, new FruitComparator());
        System.out.println(fruit);
    }
}
