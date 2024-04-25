package unit09;

import java.util.TreeMap;

public class Order {
    private int cost;
    private TreeMap<Integer, Sushi> order;

    public Order() {
        this.cost = 0;
        this.order = new TreeMap<>();
    }

    public void add(Sushi bag) {
        order.put(bag.getWeight(), bag);
        cost += bag.getPrice();
    }

    public int getCost() {
        return cost;
    }

    public TreeMap<Integer, Sushi> getOrder() {
        return order;
    }
}
