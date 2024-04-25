package unit09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fruit implements Comparable<Fruit> {
    private double price;
    private String name;

    public Fruit(String name, double price) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " $" + price;
    }

    @Override
    public int compareTo(Fruit other) {
        return this.name.compareToIgnoreCase(other.name);
    }

    public static void main(String[] args) {
        List<Fruit> fruit = new ArrayList<>();
        fruit.add(new Fruit("Orange", 1.50));
        fruit.add(new Fruit("Apple", 1.25));
        fruit.add(new Fruit("Banana", 0.75));
        fruit.add(new Fruit("Mango", 2.55));

        System.out.println(fruit);
        Collections.sort(fruit);
        System.out.println(fruit);
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }


}
