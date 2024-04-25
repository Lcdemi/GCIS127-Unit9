package unit09;

import java.util.Random;

public class Sushi implements Comparable<Sushi>{
    private int weight;
    private int number;
    private int price;

    public Sushi(int number) {
        this.number = number;
        this.weight = randomWeight();
        this.price = randomPrice();
    }
    
    private int randomWeight() {
        Random RNG = new Random();
        return RNG.nextInt(20, 101);
    }

    private int randomPrice() {
        Random RNG = new Random();
        return RNG.nextInt(10, 41);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sushi number: " + number + " which weighs: " + weight + " grams and costs: $" + price;
    }

    @Override
    public int compareTo(Sushi other) {
        return this.weight - other.weight;
    }
}
